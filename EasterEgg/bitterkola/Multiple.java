import java.util.Scanner;

public class Multiple {
  public static void main(String[] args) {
  System.out.print("  MULTIPLE    \n");

  Scanner input = new Scanner(System.in);

  System.out.print("Enter First Number: ");
  int firstNumber = input.nextInt();

  System.out.print("Enter Second Number: ");
  int secondNumber = input.nextInt();

  if (firstNumber > 0 && secondNumber > 0) {
  System.out.println("First Number and Second Number: "+ (firstNumber + secondNumber));
} else if (firstNumber < 0 && secondNumber < 0) {
  System.out.println("First Number and Second Number: "+ (firstNumber * secondNumber));
} else if ((firstNumber > 0 && secondNumber > 0) || (firstNumber < 0 && secondNumber > 0)) {
  int larger = Math.max(firstNumber, secondNumber);
  int smaller = Math.min(firstNumber, secondNumber);
  int difference = larger - smaller;
  System.out.println("Result: "+ difference);
} else {
  System.out.println("One of the number is Zero");
}
  }
}
