package ch.ivyteam.ivy.scrum.management.dialog.newSprint;

import java.util.Calendar;

import ch.ivyteam.ivy.scrum.management.Sprint;

public class CalculateMaxWorkingDays {
  public static float calculateMaxWorkingDays(Sprint sprint) {

    Float maxworkingdays = 0f;

    if (sprint.getStartDate() != null && sprint.getEndDate() != null) {

      Calendar currentDate = Calendar.getInstance();
      currentDate.setTime(sprint.getStartDate());

      Calendar endDate = Calendar.getInstance();
      endDate.setTime(sprint.getEndDate());

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
