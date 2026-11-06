package ch.ivyteam.ivy.scrum.management.sprint.methods;

import java.util.List;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.scrum.management.Sprint;

public class SprintSearch {
  public static List<Sprint> sprintFromBusinessdata() {
    List<Sprint> sprints = Ivy.repo().search(Sprint.class)
        .limit(10000)
        .execute()
        .getAll();
    return sprints;
  }

}
