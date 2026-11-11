package ch.ivyteam.ivy.scrum.management.dialog.sprintOverview;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.scrum.management.Sprint;
import ch.ivyteam.ivy.scrum.management.SprintUser;

public class CheckSprintUpdates {
  public static void checkSprintUpdates(Sprint sprint) {
    var sprintId = Ivy.repo().getId(sprint);
    var currentSprint = Ivy.repo().find(sprintId, Sprint.class);

    for (SprintUser user : sprint.getMembers()) {
      for (SprintUser currentUser : currentSprint.getMembers()) {
        if (user.getUserId().equals(currentUser.getUserId())) {
          if (!user.getWorkingDays().equals(currentUser.getWorkingDays()) || !user.getCapacity().equals(currentUser.getCapacity())) {
            user.setWorkingDays(currentUser.getWorkingDays());
            user.setCapacity(currentUser.getCapacity());
          }
        }
      }
    }
  }
}
