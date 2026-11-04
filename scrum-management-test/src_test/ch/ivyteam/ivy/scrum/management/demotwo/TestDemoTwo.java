package ch.ivyteam.ivy.scrum.management.demotwo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

import ch.ivyteam.ivy.environment.IvyTest;;

@IvyTest
public class TestDemoTwo {

  @Test
  void division() {
    assertThat(DemoTwo.division(10, 2)).isEqualTo(5);
    assertThat(DemoTwo.division(20, 1)).isEqualTo(20);
    assertThat(DemoTwo.division(2.8, 2)).isEqualTo(1.4);
    assertThat(DemoTwo.division(2, 10)).isEqualTo(0.2);
    assertThatThrownBy(() -> DemoTwo.division(10, 0))
        .as("division by 0 is not allowed")
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessage("Divisor cannot be 0");
  }

  @Test
  void add() {
    assertThat(DemoTwo.add(new Integer(2), new Integer(2))).isEqualTo(4);
    assertThatThrownBy(() -> DemoTwo.add(1, null))
        .isInstanceOf(NullPointerException.class);
    assertThatThrownBy(() -> DemoTwo.add(null, 1))
        .isInstanceOf(NullPointerException.class);
  }
}
