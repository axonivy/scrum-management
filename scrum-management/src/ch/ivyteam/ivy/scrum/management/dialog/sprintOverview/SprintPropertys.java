package ch.ivyteam.ivy.scrum.management.dialog.sprintOverview;

import java.util.List;

import ch.ivyteam.ivy.scrum.management.Sprint;
import ch.ivyteam.ivy.scrum.management.sprint.methods.SprintDataUtil;
import ch.ivyteam.ivy.scrum.management.sprint.methods.SprintSearch;

public class SprintPropertys {
  public static ChangeSprint.Result get(Sprint sprint, Integer sprintIndex) {

    List<Sprint> sprints = SprintSearch.sprintFromBusinessdata();

    SprintDataUtil.sort(sprints);

    if (!sprints.isEmpty()) {
      int lastIndex = sprints.size() - 1;
      sprintIndex = lastIndex;
      sprint = sprints.get(lastIndex);
    }
    return new ChangeSprint.Result(sprint, sprintIndex);
  }
}
