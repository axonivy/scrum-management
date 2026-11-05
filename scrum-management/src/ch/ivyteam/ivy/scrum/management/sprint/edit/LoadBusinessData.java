package ch.ivyteam.ivy.scrum.management.sprint.edit;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.scrum.management.Sprint;

public class LoadBusinessData {
  public static Sprint LoadExistingSprint(String sprintId) {
    if (sprintId != null && !sprintId.isBlank()) {
    
    Sprint existingSprint = Ivy.repo().find(sprintId, Sprint.class);
    return existingSprint;
}
  return null;

  }
}
