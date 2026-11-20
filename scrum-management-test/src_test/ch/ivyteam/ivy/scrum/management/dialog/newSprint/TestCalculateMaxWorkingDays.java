package ch.ivyteam.ivy.scrum.management.dialog.newSprint;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;

import ch.ivyteam.ivy.environment.IvyTest;
import ch.ivyteam.ivy.scrum.management.Sprint;

@IvyTest
public class TestCalculateMaxWorkingDays {

  @Test
  public void calculateMaxWorkingDays() {
    Sprint sprint = new Sprint();
    sprint.setStartDate(new GregorianCalendar(2026, Calendar.MARCH, 5).getTime());
    sprint.setEndDate(new GregorianCalendar(2026, Calendar.MARCH, 23).getTime());
    Float maxworkingdays = 0F;
    maxworkingdays = MaxWorkingDays.calculate(sprint);

    assertEquals(12, maxworkingdays);
  }

  @Test
  public void calculateMaxWorkingDays1() {
    Sprint sprint = new Sprint();
    sprint.setStartDate(new GregorianCalendar(2026, Calendar.MARCH, 7).getTime());
    sprint.setEndDate(new GregorianCalendar(2026, Calendar.MARCH, 8).getTime());
    Float maxworkingdays = 0F;
    maxworkingdays = MaxWorkingDays.calculate(sprint);

    assertEquals(0, maxworkingdays);
  }

  @Test
  public void calculateMaxWorkingDays2() {
    Sprint sprint = new Sprint();
    sprint.setStartDate(new GregorianCalendar(2026, Calendar.MARCH, 23).getTime());
    sprint.setEndDate(new GregorianCalendar(2026, Calendar.MARCH, 5).getTime());
    Float maxworkingdays = 0F;
    maxworkingdays = MaxWorkingDays.calculate(sprint);

    assertEquals(0, maxworkingdays);
  }

  @Test
  public void calculateMaxWorkingDays3() {
    Sprint sprint = new Sprint();

    sprint.setEndDate(new GregorianCalendar(2026, Calendar.MARCH, 5).getTime());
    Float maxworkingdays = 0F;
    maxworkingdays = MaxWorkingDays.calculate(sprint);

    assertEquals(0, maxworkingdays);
  }

  @Test
  public void calculateMaxWorkingDays4() {
    Sprint sprint = new Sprint();
    sprint.setStartDate(new GregorianCalendar(2026, Calendar.MARCH, 23).getTime());

    Float maxworkingdays = 0F;
    maxworkingdays = MaxWorkingDays.calculate(sprint);

    assertEquals(0, maxworkingdays);
  }

  @Test
  public void calculateMaxWorkingDays5() {
    Sprint sprint = new Sprint();
    sprint.setStartDate(new GregorianCalendar(2026, Calendar.MARCH, 7).getTime());
    sprint.setEndDate(new GregorianCalendar(2026, Calendar.MARCH, 9).getTime());
    Float maxworkingdays = 0F;
    maxworkingdays = MaxWorkingDays.calculate(sprint);

    assertEquals(0, maxworkingdays);
  }

  @Test
  public void calculateMaxWorkingDays6() {
    Sprint sprint = new Sprint();
    sprint.setStartDate(new GregorianCalendar(2026, Calendar.MARCH, 6).getTime());
    sprint.setEndDate(new GregorianCalendar(2026, Calendar.MARCH, 8).getTime());
    Float maxworkingdays = 0F;
    maxworkingdays = MaxWorkingDays.calculate(sprint);

    assertEquals(0, maxworkingdays);
  }
}
