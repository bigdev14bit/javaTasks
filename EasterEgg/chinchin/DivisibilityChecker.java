import java.util.Scanner;

public class DivisibilityChecker {
  public static void main(String[] args) {
  System.out.println("|| DIVISIBILITY CHECKER ||");

  Scanner input = new Scanner(System.in);

  System.out.print("Enter A Number: ");
  int number = input.nextInt();

  if (number % 5 == 0) {
    System.out.println("HiFive");
} 
  else if (number % 2 == 0) {
    System.out.println("HiEven");
} else {
    System.out.println("Not a multiple of 5 and not even (oDD)");
}
  }
}
