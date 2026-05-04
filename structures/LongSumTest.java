import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertion.*;

public class LongSumTest {
  @Test
  public void TestThatSumOfDigit() {
    long number = 2468;
    long expectedResult = 20;
    long actualResult = LongSum.sumOfDigits(number);
    assertEquals(actualResult);
  }
}
