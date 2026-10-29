package ch.ivyteam.ivy.scrum.management.dialog.sprintTask;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.scrum.management.Sprint;
import ch.ivyteam.ivy.scrum.management.SprintUser;

public class LoadData {
  public static SprintUser GetSprintUser(Sprint sprint, String userId) {
    for (SprintUser sprintMember : sprint.getMembers()) {
      if (sprintMember.getUserId().equals(userId)) {
        return sprintMember;
      }

    }
    throw new IllegalArgumentException("There is no sprint neither a Sprint member");
  }

  public static Sprint GetSprint(String sprintId) {
    Sprint sprint = Ivy.repo().find(sprintId, Sprint.class);
    return sprint;
  }
}
