package ch.ivyteam.ivy.scrum.management.dialog.sprintOverview;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.scrum.management.Sprint;
import ch.ivyteam.ivy.scrum.management.sprint.methods.sprintSorting;

public class NextSprint {
  public record Result(Sprint sprint, Integer sprintIndex) {}
  public static Result nextSprint(Integer sprintIndex) {

    java.util.List<Sprint> sprints = Ivy.repo().search(Sprint.class)
        .limit(10000)
        .execute()
        .getAll();
    Sprint sprint = null;
    sprintSorting.sortSprints(sprints);
    if (!sprints.isEmpty()) {
      sprint = sprints.get(sprintIndex);
      if (sprintIndex < sprints.size() - 1) {
        int newIndex = sprintIndex + 1;

        sprint = sprints.get(newIndex);
        sprintIndex = newIndex;

      }
    }
    return new Result(sprint, sprintIndex);
  }
}
