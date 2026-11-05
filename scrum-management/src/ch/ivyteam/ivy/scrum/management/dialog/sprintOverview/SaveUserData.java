package ch.ivyteam.ivy.scrum.management.dialog.sprintOverview;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.scrum.management.Sprint;

public class SaveUserData {
  public static void saveUserData(Sprint sprint) {
    Ivy.repo().save(sprint);
  }

}
