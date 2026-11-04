package ch.ivyteam.ivy.scrum.management.sprint.methods;

import ch.ivyteam.ivy.scrum.management.Sprint;

public class sprintSorting {
  public static java.util.List<Sprint> sortSprints(java.util.List<Sprint> sprints)
    {
      for (int i = 0; i < sprints.size() - 1; i++) {
      for (int j = i + 1; j < sprints.size(); j++) {
        if (sprints.get(i).getSortIndex().longValue() > sprints.get(j).getSortIndex().longValue()) {
          Sprint temp = sprints.get(i);
          sprints.set(i, sprints.get(j));
          sprints.set(j, temp);
        }
      }
    }
    return sprints;
    }
}
