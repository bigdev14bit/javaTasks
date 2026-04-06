import java.util.Scanner;

public class ZeroCase {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.print("Enter First Number: ");
  int m = input.nextInt();

  System.out.print("Enter Second Number: ");
  int n = input.nextInt();

  if (n == 0) {
  System.out.println("Error Division By Zero");
} else {
  double compute = m / n;
  System.out.println("Result: "+ compute); 
}
  }
}
