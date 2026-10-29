package ch.ivyteam.ivy.scrum.management.sprint.create;

import java.util.List;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.scripting.objects.Duration;
import ch.ivyteam.ivy.scrum.management.Sprint;

public class CreateSprint {
  public static Sprint newSprint() {
    List<Sprint> sprints = Ivy.repo().search(Sprint.class)
        .limit(10000)
        .execute()
        .getAll();

    for (int i = 0; i < sprints.size() - 1; i++) {
      for (int j = i + 1; j < sprints.size(); j++) {
        if (sprints.get(i).getSortIndex().longValue() > sprints.get(j).getSortIndex().longValue()) {
          Sprint temp = sprints.get(i);
          sprints.set(i, sprints.get(j));
          sprints.set(j, temp);
        }
      }
    }

    Sprint nextSprint = new Sprint();
    if (!sprints.isEmpty()) {
      Sprint lastSprint = sprints.getLast();
      nextSprint.setSprintNumber(lastSprint.getSprintNumber().longValue() + 1);
      nextSprint.setStartDate(lastSprint.getStartDate().add(new Duration("P21D")));
      nextSprint.setEndDate(lastSprint.getEndDate().add(new Duration("P21D")));
      nextSprint.setVersionCode(lastSprint.getVersionCode());
      nextSprint.setSprintPointsPerDay(lastSprint.getSprintPointsPerDay());

    }
    return nextSprint;
  }
}
