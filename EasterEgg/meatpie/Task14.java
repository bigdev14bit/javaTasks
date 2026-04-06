import java.util.Scanner;

public class Task14 {
  public static void main(String[] args) {
  
  Scanner task = new Scanner(System.in);

  System.out.print("Enter First Number: ");
  int firstNumber = task.nextInt();

  System.out.print("Enter Second Number: ");
  int secondNumber = task.nextInt();

  System.out.print("Enter Third Number: ");
  int thirdNumber = task.nextInt();

  int average = (firstNumber + secondNumber + thirdNumber)/3;

  System.out.println("Average: "+ average);
  }
}
