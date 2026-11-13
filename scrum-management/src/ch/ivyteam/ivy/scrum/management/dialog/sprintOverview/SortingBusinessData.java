package ch.ivyteam.ivy.scrum.management.dialog.sprintOverview;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.scrum.management.Sprint;
import ch.ivyteam.ivy.scrum.management.sprint.methods.SprintSorting;

public class SortingBusinessData {
  public static LoadsNextSprint.Result sort(Sprint sprint, Integer sprintIndex) {

    java.util.List<Sprint> sprints = Ivy.repo().search(Sprint.class)
        .limit(10000)
        .execute()
        .getAll();

    SprintSorting.sort(sprints);

    if (!sprints.isEmpty()) {
      int lastIndex = sprints.size() - 1;
      sprintIndex = lastIndex;
      sprint = sprints.get(lastIndex);
    }
    return new LoadsNextSprint.Result(sprint, sprintIndex);
  }
}
