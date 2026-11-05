package ch.ivyteam.ivy.scrum.management.dialog.newSprint;

import java.util.Calendar;
import ch.ivyteam.ivy.scrum.management.Sprint;

public class CalculateMaxWorkingDays {
  public static Integer calculateMaxWorkingDays(Sprint sprint) {

    int maxworkingdays = 0;

    if (sprint.getStartDate() != null && sprint.getEndDate() != null) {

      Calendar currentDate = Calendar.getInstance();
      currentDate.setTime(sprint.getStartDate().toJavaDate());

      Calendar endDate = Calendar.getInstance();
      endDate.setTime(sprint.getEndDate().toJavaDate());

      while (!currentDate.after(endDate)) {

        int day = currentDate.get(Calendar.DAY_OF_WEEK);

        if (day != Calendar.SATURDAY && day != Calendar.SUNDAY) {
          maxworkingdays++;
        }

        currentDate.add(Calendar.DAY_OF_MONTH, 1);
      }
      maxworkingdays--;

      sprint.setMaxWorkingDays(maxworkingdays);
    }
    return maxworkingdays;
  }
}
