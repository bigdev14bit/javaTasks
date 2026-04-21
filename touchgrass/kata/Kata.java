import java.util.Scanner;

public class Kata {
  public boolean isEven(int number) {
    if(number % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }
  public static void main(String[] args) {
    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter A Number: ");
    int number = inputCollector.nextInt();

    Kata kata = new Kata();

    boolean result = kata.isEven(number);

    System.out.println(number + " is " + result);
  }
}
