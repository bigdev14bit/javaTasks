public class PentagonNumber {
  public static int getPentagonNumber(int number) {
    int numberOfPentagon = (number * (3 * number) - 1) / 2;
      return numberOfPentagon;
  }
}
