package ch.ivyteam.ivy.scrum.management.sprint.methods;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.scrum.management.Sprint;

public class SprintSearch {
  public static java.util.List<Sprint> sprintFromBusinessdata() {
    java.util.List<Sprint> sprints = Ivy.repo().search(Sprint.class)
        .limit(10000)
        .execute()
        .getAll();
    return sprints;
  }

}
