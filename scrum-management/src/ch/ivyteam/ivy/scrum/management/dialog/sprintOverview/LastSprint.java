package ch.ivyteam.ivy.scrum.management.dialog.sprintOverview;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.scrum.management.Sprint;

public class LastSprint {
  public static NextSprint.Result lastSprint(Sprint sprint, Integer sprintIndex) {

    java.util.List<Sprint> sprints = Ivy.repo().search(Sprint.class)
        .limit(10000)
        .execute()
        .getAll();

    for (
        int i = 0; i < sprints.size() - 1; i++) {
      for (int j = i + 1; j < sprints.size(); j++) {
        if (sprints.get(i).getSortIndex() > sprints.get(j).getSortIndex()) {
          Sprint temp = sprints.get(i);
          sprints.set(i, sprints.get(j));
          sprints.set(j, temp);
        }
      }
    }

    if (!sprints.isEmpty() && sprintIndex > 0) {
      int newIndex = sprintIndex - 1;

      sprintIndex = newIndex;
      sprint = sprints.get(newIndex);

    }
    return new NextSprint.Result(sprint, sprintIndex);
  }
}
