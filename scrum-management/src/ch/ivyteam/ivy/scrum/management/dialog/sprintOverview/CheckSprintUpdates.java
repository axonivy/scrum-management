package ch.ivyteam.ivy.scrum.management.dialog.sprintOverview;

import org.primefaces.PrimeFaces;
import org.primefaces.shaded.json.JSONArray;
import org.primefaces.shaded.json.JSONObject;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.scrum.management.Sprint;
import ch.ivyteam.ivy.scrum.management.SprintUser;

public class CheckSprintUpdates {
  public static void check(Sprint sprint) {
    var sprintId = Ivy.repo().getId(sprint);
    var currentSprint = Ivy.repo().find(sprintId, Sprint.class);
    if (currentSprint != null) {
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
    }
  }
}
