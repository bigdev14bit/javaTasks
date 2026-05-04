import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertion.*;

public class NumberOfPentagonTest {
  @Test
  public void TestThatNumberOfPentagon() {
    int number = 10;
    int expectedNumber = 145;
    int actualNumber = PentagonNumber.getPentagonNumber(number);
    assertEquals(actualNumber, expectedNumber);
  }
}
