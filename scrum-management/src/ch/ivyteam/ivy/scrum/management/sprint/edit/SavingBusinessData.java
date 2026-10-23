package ch.ivyteam.ivy.scrum.management.sprint.edit;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.scrum.management.Sprint;

public class SavingBusinessData {
  public static Sprint SavingInBusinessData(Sprint sprint, String sprintId) {
    if (sprintId != null && !sprintId.isBlank()) {

      Sprint existingSprint = Ivy.repo().find(sprintId, Sprint.class);

      existingSprint.setSprintNumber(sprint.getSprintNumber());
      existingSprint.setStartDate(sprint.getStartDate());
      existingSprint.setEndDate(sprint.getEndDate());
      existingSprint.setMaxWorkingDays(sprint.getMaxWorkingDays());
      existingSprint.setSprintPointsPerDay(sprint.getSprintPointsPerDay());
      existingSprint.setVersionCode(sprint.getVersionCode());

      Ivy.repo().save(existingSprint);

      return existingSprint;

    }
    throw new IllegalArgumentException("Sprint Id is empty");
  }
}
