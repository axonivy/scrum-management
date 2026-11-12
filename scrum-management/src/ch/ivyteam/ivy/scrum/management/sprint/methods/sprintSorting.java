package ch.ivyteam.ivy.scrum.management.sprint.methods;

import java.util.Comparator;
import java.util.List;

import ch.ivyteam.ivy.scrum.management.Sprint;

public class sprintSorting {
  public static void sortSprints(List<Sprint> sprints) {
    sprints.sort(Comparator.comparing(sprint -> sprint.getSortIndex()));
  }
}
