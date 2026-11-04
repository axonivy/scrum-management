package ch.ivyteam.ivy.scrum.management.demo;

public class Execute {
    public void tryout() {
      Demo.addTwoNumbersStatic(1, 2);
      // Demo.resultStatic = 3

      Demo.addTwoNumbersStatic(2, 2);
      // Demo.resultStatic = 4

      var myclass = new Demo();
      myclass.addTwoNumbers(5, 6);

      var mySecondClass = new Demo();
      mySecondClass.addTwoNumbers(10,10);

      // myClass.result = 11
      // mySecondClass.result = 20
    }
}
