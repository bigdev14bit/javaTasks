import java.util.Scanner;

public class Product {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.print("Enter First Number: ");
  int firstNumber = input.nextInt();

  System.out.print("Enter Second Number: ");
  int secondNumber = input.nextInt();

  int product = firstNumber * secondNumber;

  System.out.println("Product: "+ product);
  }
}
