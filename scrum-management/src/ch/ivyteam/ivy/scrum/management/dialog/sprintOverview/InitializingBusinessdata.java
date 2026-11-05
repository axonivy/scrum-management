package ch.ivyteam.ivy.scrum.management.dialog.sprintOverview;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.scrum.management.Sprint;

public class InitializingBusinessdata {
  public static NextSprint.Result SortingBusinessdata(Sprint sprint, Integer sprintIndex) {

    java.util.List<Sprint> sprints = Ivy.repo().search(Sprint.class)
        .limit(10000)
        .execute()
        .getAll();

    for (int i = 0; i < sprints.size() - 1; i++) {
      for (int j = i + 1; j < sprints.size(); j++) {
        if (sprints.get(i).getSortIndex() > sprints.get(j).getSortIndex()) {
          Sprint temp = sprints.get(i);
          sprints.set(i, sprints.get(j));
          sprints.set(j, temp);
        }
      }
    }

    if (!sprints.isEmpty()) {
      int lastIndex = sprints.size() - 1;
      sprintIndex = lastIndex;
      sprint = sprints.get(lastIndex);
    }
    return new NextSprint.Result(sprint, sprintIndex);
  }
}
