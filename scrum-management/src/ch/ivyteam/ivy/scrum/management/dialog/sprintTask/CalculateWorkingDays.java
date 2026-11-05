package ch.ivyteam.ivy.scrum.management.dialog.sprintTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import ch.ivyteam.ivy.scrum.management.Sprint;

public class CalculateWorkingDays {
    public static List<java.time.LocalDate> WorkingDates(Sprint sprint) {
        List<LocalDate> workingDates = new ArrayList<>();
        if (sprint.getStartDate() != null && sprint.getEndDate() != null) {

            Calendar currentDate = Calendar.getInstance();
            currentDate.setTime(sprint.getStartDate().toJavaDate());

            Calendar endDate = Calendar.getInstance();
            endDate.setTime(sprint.getEndDate().toJavaDate());
            Calendar lastWednesday = Calendar.getInstance();
            lastWednesday.setTime(sprint.getEndDate().toJavaDate());

            while (lastWednesday.get(Calendar.DAY_OF_WEEK) != Calendar.WEDNESDAY) {
                lastWednesday.add(Calendar.DAY_OF_MONTH, -1);
            }
            
            while (!currentDate.after(endDate)) {

                int day = currentDate.get(Calendar.DAY_OF_WEEK);

                LocalDate date = LocalDate.of(
                        currentDate.get(Calendar.YEAR),
                        currentDate.get(Calendar.MONTH) + 1,
                        currentDate.get(Calendar.DAY_OF_MONTH));

                boolean isLastWednesday =
                        currentDate.get(Calendar.YEAR) == lastWednesday.get(Calendar.YEAR)
                                && currentDate.get(Calendar.DAY_OF_YEAR) == lastWednesday.get(Calendar.DAY_OF_YEAR);

                if (day != Calendar.SATURDAY && day != Calendar.SUNDAY && !isLastWednesday) {
                    workingDates.add(date);
                }

                currentDate.add(Calendar.DAY_OF_MONTH, 1);
            }
        }
        return workingDates;

    }
}
