package ch.ivyteam.ivy.scrum.management.dialog.sprintOverview;

import java.util.List;

import ch.ivyteam.ivy.scrum.management.Sprint;
import ch.ivyteam.ivy.scrum.management.sprint.methods.SprintSearch;
import ch.ivyteam.ivy.scrum.management.sprint.methods.sprintSorting;

public class InitializingBusinessdata {
  public static NextSprint.Result SortingBusinessdata(Sprint sprint, Integer sprintIndex) {

    List<Sprint> sprints = SprintSearch.sprintFromBusinessdata();

    sprints = sprintSorting.sortSprints(sprints);

    if (!sprints.isEmpty()) {
      int lastIndex = sprints.size() - 1;
      sprintIndex = lastIndex;
      sprint = sprints.get(lastIndex);
    }
    return new NextSprint.Result(sprint, sprintIndex);
  }
}
