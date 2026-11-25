package ch.ivyteam.ivy.scrum.management.dialog.sprintOverview;

import java.util.Objects;

import org.primefaces.PrimeFaces;
import org.primefaces.shaded.json.JSONArray;
import org.primefaces.shaded.json.JSONObject;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.scrum.management.Sprint;
import ch.ivyteam.ivy.scrum.management.SprintUser;

public class SprintUpdates {
  public static void check(Sprint sprint) {
    var sprintId = Ivy.repo().getId(sprint);
    var currentSprint = Ivy.repo().find(sprintId, Sprint.class);
    boolean sprintChanged = false;
    if (currentSprint != null) {
      if (!Objects.equals(sprint.getMaxWorkingDays(), currentSprint.getMaxWorkingDays()) || !Objects.equals(sprint.getVersionCode(), currentSprint.getVersionCode()) || !Objects.equals(sprint.getSprintNumber(), currentSprint.getSprintNumber())
          || !Objects.equals(sprint.getSprintPointsPerDay(), currentSprint.getSprintPointsPerDay()) || !Objects.equals(sprint.getStartDate(), currentSprint.getStartDate()) || !Objects.equals(sprint.getEndDate(), currentSprint.getEndDate())) {
        sprintChanged = true;
        sprint.setVersionCode(currentSprint.getVersionCode());
        sprint.setSprintNumber(currentSprint.getSprintNumber());
        sprint.setStartDate(currentSprint.getStartDate());
        sprint.setEndDate(currentSprint.getEndDate());
        sprint.setMaxWorkingDays(currentSprint.getMaxWorkingDays());
        sprint.setSprintPointsPerDay(currentSprint.getSprintPointsPerDay());
      }
      JSONArray changedUsers = new JSONArray();

      for (SprintUser user : sprint.getMembers()) {
        for (SprintUser currentUser : currentSprint.getMembers()) {
          if (user.getUserId().equals(currentUser.getUserId())) {

            if (!user.getWorkingDays().equals(currentUser.getWorkingDays()) || !user.getCapacity().equals(currentUser.getCapacity())) {
              JSONObject changedUser = new JSONObject();
              changedUser.put("id", currentUser.getUserId());
              changedUser.put("capacity", currentUser.getCapacity());
              changedUser.put("days", currentUser.getWorkingDays());
              changedUsers.put(changedUser);

              user.setWorkingDays(currentUser.getWorkingDays());
              user.setCapacity(currentUser.getCapacity());
            }
          }
        }
      }
      PrimeFaces.current().ajax().addCallbackParam("changedUsers", changedUsers);
      PrimeFaces.current().ajax().addCallbackParam("sprintChanged", sprintChanged);
    }
  }
}
