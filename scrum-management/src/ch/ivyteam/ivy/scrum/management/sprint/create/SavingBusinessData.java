package ch.ivyteam.ivy.scrum.management.sprint.create;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.scrum.management.Sprint;
import ch.ivyteam.ivy.scrum.management.SprintUser;
import ch.ivyteam.ivy.security.IUser;

public class SavingBusinessData {
  public static Sprint savedSprint(Sprint sprint) {

    java.util.List<Sprint> sprints = Ivy.repo().search(Sprint.class)
        .limit(10000)
        .execute()
        .getAll();
    int nextSortIndex = 0;

    for (Sprint existingSprint : sprints) {
      if (existingSprint.getSortIndex() != null && existingSprint.getSortIndex() >= nextSortIndex) {
        nextSortIndex = existingSprint.getSortIndex() + 1;
      }
    }

    Sprint newSprint = new Sprint();
    newSprint.setSortIndex(nextSortIndex);

    newSprint.setSprintNumber(sprint.getSprintNumber());
    newSprint.setStartDate(sprint.getStartDate());
    newSprint.setEndDate(sprint.getEndDate());
    newSprint.setMaxWorkingDays(sprint.getMaxWorkingDays());
    newSprint.setSprintPointsPerDay(sprint.getSprintPointsPerDay());
    newSprint.setVersionCode(sprint.getVersionCode());

    // Inputs users from users.yaml
    newSprint.setMembers(ch.ivyteam.ivy.scripting.objects.List.create(SprintUser.class));
    for (IUser user : Ivy.security().users().paged()) {

      SprintUser member = new SprintUser();

      member.setUserId(user.getSecurityMemberId());
      member.setUserName(user.getName());
      member.setName(user.getFullName());
      member.setWorkingDays(-1);
      member.setCapacity(0);
      newSprint.getMembers().add(member);
    }
    Ivy.repo().save(newSprint);

    return newSprint;

  }

}
