import java.util.Scanner;

public class Divisibility {
  public static void main(String[] args) {
  System.out.print("  DIVISIBLE    \n");

  Scanner input = new Scanner(System.in);

  System.out.print("Enter First Number: ");
  int firstNumber = input.nextInt();

  System.out.print("Enter Second Number: ");
  int secondNumber = input.nextInt();

  if (secondNumber == 0) {
  System.out.println("Error Division By Zero");
} else if (firstNumber % secondNumber == 0) {
  System.out.println(firstNumber + " is a multiple of "+ secondNumber);
} else {
  System.out.println("🫣️🫣️🫣️");
}
  }
}
