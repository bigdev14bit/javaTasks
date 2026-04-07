import java.util.Scanner;

public class SumOfDigit {
  public static void main(String[] args) {
  System.out.print("-------------------\n");
  System.out.print("-- S      U      M  -- \n");
  System.out.print("-------------------\n");
  Scanner input = new Scanner(System.in);

  System.out.print("Enter A 5 DIGIT Number: ");
  int fiveNumber = input.nextInt();

  int firstNumber = fiveNumber / 10000;
  int lastNumber = fiveNumber % 10;

  int sum = firstNumber + lastNumber;

  System.out.println("First Digit: "+ firstNumber);
  System.out.println("Last Digit: "+ lastNumber);
  System.out.println("Sum of The First And Last Digit: "+ sum);
  }
}

