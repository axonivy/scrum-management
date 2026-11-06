package ch.ivyteam.ivy.scrum.management.sprint.create;

import java.util.List;

import org.apache.commons.lang3.time.DateUtils;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.scrum.management.Sprint;
import ch.ivyteam.ivy.scrum.management.sprint.methods.sprintSorting;

public class CreateSprint {
  public static Sprint newSprint() {
    List<Sprint> sprints = Ivy.repo().search(Sprint.class)
        .limit(10000)
        .execute()
        .getAll();

    sprintSorting.sortSprints(sprints);

    Sprint nextSprint = new Sprint();
    if (!sprints.isEmpty()) {
      Sprint lastSprint = sprints.getLast();
      nextSprint.setSprintNumber(lastSprint.getSprintNumber() + 1);
      nextSprint.setStartDate(DateUtils.addDays(lastSprint.getStartDate(), 21));
      nextSprint.setEndDate(DateUtils.addDays(lastSprint.getEndDate(), 21));
      nextSprint.setVersionCode(lastSprint.getVersionCode());
      nextSprint.setSprintPointsPerDay(lastSprint.getSprintPointsPerDay());

    }
    return nextSprint;
  }
}
