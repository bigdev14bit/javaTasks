public class Maximum {
  public int findMaximum(int firstNumber, int secondNumber) {
    if(firstNumber > secondNumber) {
      return firstNumber;
    } else {
      return secondNumber;
    }
  }

    public static void main(String[] args) {
      Maximum max = new Maximum();
      int result = max.findMaximum(200, 22);
      System.out.println("The maximum is: " + result);
  }
}
