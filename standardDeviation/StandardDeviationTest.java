import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StandardDeviationTest {
  @Test
  public void TestThatStandardDeviationExist() {
    int[] array = {2, 4, 6, 8, 10};
    StandardDeviation.sum(array);
  }
  @Test
  public void TestThatStandardDeviationSumOfArrayIsAccurate() {
    int[] array = {2, 4, 6, 8, 10};
    double expected = 30;
    double actual = StandardDeviation.sum(array);
    assertEquals(actual, expected);
  }
  @Test
  public void TEstThatMeanOfTheStandardDeviationIsAccurate() {
    int[] array = {2, 4, 6, 8, 10};
    double expected = 3;
    double actual = StandardDeviation.mean(array);
    assertEquals(actual, expected);
  }
  @Test
  public void TestThatMeanDeviationIsAccurate() {
    int[] array = {2, 4, 6, 8, 10};
    double expected = 30;
    double actual = StandardDeviation.meanDeviation(array);
    assertEquals(actual, expected);
  }
  @Test
  public void TestThatVarianceOfStandardDeviationIsAccurate() {
    int[] array = {2, 4, 6, 8, 10};
    double expected = 6;
    double actual = StandardDeviation.variance(array);
    assertEquals(actual, expected);
  }
  @Test
  public void TestThatStandardDeviationIsAccurate() {
    int[] array = {2, 4, 6, 8, 10};
    double expected = 2;
    double actual = StandardDeviation.standardDeviation(array);
    assertEquals(actual, expected);
  }
}
