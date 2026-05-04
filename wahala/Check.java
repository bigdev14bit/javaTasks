//OMO.
public class Check {
  public static void main(String[] args) {
    
  int check = largestNumberOf(10, 30, 50);
  System.out.print("Largest Number: " + check);
}

public static int largestNumberOf(int firstNumber, int secondNumber, int thirdNumber) {

  int largestNumberOf = firstNumber;

    if(secondNumber > largestNumberOf)
    largestNumberOf = secondNumber;

    if(thirdNumber > largestNumberOf)
    largestNumberOf = thirdNumber;

    return largestNumberOf;

    
  }
}
