package ch.ivyteam.ivy.scrum.management.dialog.sprintOverview;

import java.util.List;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.scrum.management.Sprint;
import ch.ivyteam.ivy.scrum.management.SprintUser;

public class SaveUserData {
  public static void saveUserData(Sprint sprint, String userId) {
    Ivy.log().info("userid:" + userId);
    List<SprintUser> users = sprint.getMembers();
    for (SprintUser user : users) {
      if (user.getUserId().equals(userId)) {
        Ivy.repo().update(sprint, currentSprint -> {
          for (SprintUser currentUser : currentSprint.getMembers()) {
            if (currentUser.getUserId().equals(userId)) {
              currentUser.setCapacity(user.getCapacity());
              currentUser.setWorkingDays(user.getWorkingDays());
              break;
            }
          }
        });
        break;
      }
    }
  }

}
