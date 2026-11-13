package ch.ivyteam.ivy.scrum.management.sprint.methods;

import ch.ivyteam.ivy.scrum.management.Sprint;

public class SprintSorting {
  public static void sort(java.util.List<Sprint> sprints) {
    sprints.sort(java.util.Comparator.comparing(sprint -> sprint.getSortIndex()));
  }
}
