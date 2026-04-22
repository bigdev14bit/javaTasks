import java.util.Scanner;

public class PowerOfTwo {
  public static void main(String[] args) {
    
    Scanner inputCollector = new Scanner(System.in);

    long result = 1;

    System.out.print("Enter Power of (n): ");
    int number = inputCollector.nextInt();

    for(int power = 1; power < number; power++) {
      result *= 2;
      System.out.println("2^" + power + " = " + result);
    }
  }
}
