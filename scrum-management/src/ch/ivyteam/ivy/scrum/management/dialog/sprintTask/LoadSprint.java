package ch.ivyteam.ivy.scrum.management.dialog.sprintTask;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.scrum.management.Sprint;
import ch.ivyteam.ivy.scrum.management.SprintUser;

public class LoadSprint {
  public static SprintUser getSprintUser(Sprint sprint, String userId) {
    for (SprintUser sprintMember : sprint.getMembers()) {
      if (sprintMember.getUserId().equals(userId)) {
        return sprintMember;
      }

    }
    throw new IllegalStateException("There is no sprint neither a Sprint member");
  }

  public static Sprint getSprint(String sprintId) {
    Sprint sprint = Ivy.repo().find(sprintId, Sprint.class);
    return sprint;
  }
}
