import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {
    Scanner sum = new Scanner(System.in);

    System.out.print("Enter First Number: ");
    int firstNumber = sum.nextInt();

    System.out.print("Enter Second Number: ");
    int secondNumber = sum.nextInt();

    System.out.print("Result: "+ (firstNumber + secondNumber));
  }
}
