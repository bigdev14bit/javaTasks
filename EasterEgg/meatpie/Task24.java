import java.util.Scanner;

public class Task24 {
  public static void main(String[] args) {
    Scanner sum = new Scanner(System.in);

     System.out.print("Enter First Number: ");
    int firstNumber = sum.nextInt();

    System.out.print("Enter Second Number: ");
    int secondNumber = sum.nextInt();

    int swap = firstNumber;
    firstNumber = secondNumber;
    secondNumber = firstNumber;
   
     System.out.println("Swap Is: "+ swap);
  }
}
