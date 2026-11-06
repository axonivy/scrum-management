package ch.ivyteam.ivy.scrum.management.sprint.create;

import java.util.List;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.scrum.management.Sprint;
import ch.ivyteam.ivy.scrum.management.SprintUser;
import ch.ivyteam.ivy.security.IUser;
import ch.ivyteam.ivy.scrum.management.sprint.methods.SprintSearch;
public class SavingBusinessData {
  public static Sprint savedSprint(Sprint sprint) {

    List<Sprint> sprints = SprintSearch.sprintFromBusinessdata();
    int nextSortIndex = 0;
    Sprint previousSprint = null;

    for (Sprint existingSprint : sprints) {
      if (existingSprint.getSortIndex() != null && existingSprint.getSortIndex() >= nextSortIndex) {
        nextSortIndex = existingSprint.getSortIndex() + 1;
        previousSprint = existingSprint;
      }
    }

    Sprint newSprint = sprint;
    newSprint.setSortIndex(nextSortIndex);

    // Inputs users from users.yaml
    newSprint.setMembers(ch.ivyteam.ivy.scripting.objects.List.create(SprintUser.class));
    for (IUser user : Ivy.security().users().paged()) {

      SprintUser member = new SprintUser();

      member.setUserId(user.getSecurityMemberId());
      member.setUserName(user.getName());
      member.setName(user.getFullName());
      member.setWorkingDays(-1.0);
      member.setCapacity(0);
      if (previousSprint != null) {
        for (SprintUser old : previousSprint.getMembers()) {
          if (old.getUserId().equals(member.getUserId())) {
            member.setCapacity(old.getCapacity());
          }
        }
      }
      newSprint.getMembers().add(member);
    }
    Ivy.repo().save(newSprint);

    return newSprint;

  }

}
