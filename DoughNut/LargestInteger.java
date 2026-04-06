import java.util.Scanner;

public class LargestInteger {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.print("Enter First Number: ");
  int firstNumber = input.nextInt();

  System.out.print("Enter Second Number: ");
  int secondNumber = input.nextInt();

  if (firstNumber > secondNumber) {
  System.out.println("The Greater Number Is: "+ firstNumber);
} else {
  System.out.println("The Greater Number Is: "+ secondNumber);
}

  }
}
