package ch.ivyteam.ivy.scrum.management.demo;

public class Demo {
    public int result = 0;
    public static int resultStatic = 0;

    public static void addTwoNumbersStatic(int a, int b) {
        resultStatic = a + b;
    }

    public void addTwoNumbers(int a, int b) {
        result = a + b;
    }
}
