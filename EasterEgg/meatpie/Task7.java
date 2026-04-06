import java.util.Scanner;

public class Square {
  public static void main(String[] args) {
    Scanner sum = new Scanner(System.in);

     System.out.print("Enter First Number: ");
    int firstNumber = sum.nextInt();

    System.out.print("Enter Second Number: ");
    int secondNumber = sum.nextInt();

    int square = firstNumber * secondNumber;
   
     System.out.println("Result: "+ (firstNumber * secondNumber) * (firstNumber * secondNumber));
  }
}
