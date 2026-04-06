import java.util.Scanner;

public class SimpleCalc {
  public static void main(String[] args) {
  System.out.print("*" * 50);
  System.out.print("Simple Calculation");
  System.out.print("*" * 50);

  Scanner testing = new Scanner(System.in);

  System.out.print("Enter First Number: ");
  int firstNumber = testing.nextInt();

  System.out.print("Enter Operator: ");
  String operator = testing.next();

  System.out.print("Enter Second Number: ");
  int secondNumber = testing.nextInt();

  if (operator == "+") {
    System.out.print("Result: ", (firstNumber + secondNumber));
} 

  }
}
