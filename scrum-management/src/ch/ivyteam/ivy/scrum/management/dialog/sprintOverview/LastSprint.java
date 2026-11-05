package ch.ivyteam.ivy.scrum.management.dialog.sprintOverview;

import ch.ivyteam.ivy.scrum.management.Sprint;
import ch.ivyteam.ivy.scrum.management.sprint.methods.SprintSearch;
import ch.ivyteam.ivy.scrum.management.sprint.methods.sprintSorting;

public class LastSprint {
  public static NextSprint.Result lastSprint(Sprint sprint, Integer sprintIndex) {

    java.util.List<Sprint> sprints = SprintSearch.sprintFromBusinessdata();

    sprints = sprintSorting.sortSprints(sprints);

    if (!sprints.isEmpty() && sprintIndex > 0) {
      int newIndex = sprintIndex - 1;

      sprintIndex = newIndex;
      sprint = sprints.get(newIndex);

    }
    return new NextSprint.Result(sprint, sprintIndex);
  }
}
