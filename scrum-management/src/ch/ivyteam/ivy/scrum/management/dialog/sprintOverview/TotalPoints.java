package ch.ivyteam.ivy.scrum.management.dialog.sprintOverview;

import ch.ivyteam.ivy.scrum.management.Sprint;
import ch.ivyteam.ivy.scrum.management.SprintUser;

public class TotalPoints {
   public static Double calculateTotalPoints(Sprint sprint) {
      double totalpoints = 0;
      if (sprint != null && sprint.getMembers() != null) {
         for (SprintUser member : sprint.getMembers()) {

            if (member.getWorkingDays().intValue() >= 0) {
               totalpoints = totalpoints + member.getWorkingDays().doubleValue() * (member.getCapacity().doubleValue() / 100) * sprint.getSprintPointsPerDay().doubleValue();
            }

         }
      }
      return totalpoints;
   }
}
