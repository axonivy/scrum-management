package ch.ivyteam.ivy.scrum.management.dialog.sprintTask;

import java.time.LocalDate;
import java.util.List;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.scrum.management.Sprint;
import ch.ivyteam.ivy.scrum.management.SprintUser;

public class SaveTask {
  public static void SaveUserEntry(Sprint sprint, SprintUser member, List<LocalDate> absenceDays) {
    member.setWorkingDays(sprint.getMaxWorkingDays().intValue() - (absenceDays == null ? 0 : absenceDays.size()));
    Ivy.repo().save(sprint);
  }
}
