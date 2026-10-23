package ch.ivyteam.ivy.scrum.management.dialog.sprintOverview;

import java.util.List;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.scrum.management.Sprint;

public class NextSprint {
  public record Result(Sprint sprint, Integer sprintIndex) {}
  public static Result nextSprint(Sprint sprint, Integer sprintIndex) {

    List<Sprint> sprints = Ivy.repo().search(Sprint.class)
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
    if (!sprints.isEmpty() && sprintIndex < sprints.size() - 1) {
      int newIndex = sprintIndex + 1;

      sprint = sprints.get(newIndex);
      sprintIndex = newIndex;

    }
    return new Result(sprint, sprintIndex);
  }
}
