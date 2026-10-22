package ch.ivyteam.ivy.scrum.management.demotwo;

public class DemoTwo {

  public static double division(double dividend, double divisor) {
    if (divisor == 0) {
      throw new IllegalArgumentException("Divisor cannot be 0");
    }
    return dividend / divisor;
  }

  public static Integer add(Integer a, Integer b) {
    return a + b;
  }
}
