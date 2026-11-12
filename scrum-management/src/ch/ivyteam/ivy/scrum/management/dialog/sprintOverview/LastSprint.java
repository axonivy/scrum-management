package ch.ivyteam.ivy.scrum.management.dialog.sprintOverview;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.scrum.management.Sprint;
import ch.ivyteam.ivy.scrum.management.sprint.methods.SprintSorting;

public class LastSprint {
  public static NextSprint.Result lastSprint(Sprint sprint, Integer sprintIndex) {

    java.util.List<Sprint> sprints = Ivy.repo().search(Sprint.class)
        .limit(10000)
        .execute()
        .getAll();

    SprintSorting.sortSprints(sprints);

    if (!sprints.isEmpty() && sprintIndex > 0) {
      int newIndex = sprintIndex - 1;

      sprintIndex = newIndex;
      sprint = sprints.get(newIndex);

    }
    return new NextSprint.Result(sprint, sprintIndex);
  }
}
