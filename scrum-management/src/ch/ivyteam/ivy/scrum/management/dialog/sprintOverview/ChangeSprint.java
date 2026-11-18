package ch.ivyteam.ivy.scrum.management.dialog.sprintOverview;

import ch.ivyteam.ivy.scrum.management.Sprint;
import ch.ivyteam.ivy.scrum.management.sprint.methods.SprintSearch;
import ch.ivyteam.ivy.scrum.management.sprint.methods.sprintSorting;

public class ChangeSprint {
  public record Result(Sprint sprint, Integer sprintIndex) {}

  public static Result nextSprint(Sprint sprint, Integer sprintIndex) {
    int newIndex = sprintIndex + 1;
    Result result = ChangeSprint.changeSprint(newIndex);
    if (result != null) {
      return result;
    }
    return new Result(sprint, sprintIndex);
  }

  public static Result lastSprint(Sprint sprint, Integer sprintIndex) {

    int newIndex = sprintIndex - 1;
    Result result = ChangeSprint.changeSprint(newIndex);
    if (result != null) {
      return result;
    }
    return new Result(sprint, sprintIndex);
  }

  private static Result changeSprint(Integer newIndex) {
    java.util.List<Sprint> sprints = SprintSearch.sprintFromBusinessdata();
    sprints = sprintSorting.sortSprints(sprints);
    if (!sprints.isEmpty() && newIndex >= 0 && newIndex < sprints.size()) {
      Sprint sprint = sprints.get(newIndex);
      return new Result(sprint, newIndex);
    }
    return null;
  }
}
