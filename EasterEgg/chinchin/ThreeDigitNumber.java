import java.util.Scanner;

public class ThreeDigitNumber {
  public static void main(String[] args) {
    System.out.print("THREE DIGIT CHECKER\n");

    Scanner input = new Scanner(System.in);

    System.out.print("Enter A 3 Digit Number: ");
    int number = input.nextInt();

    if (number >= 100 && number <= 999) {
    System.out.println(number + " is a 3 digit number");
} else {
    System.out.println("Number is not a 3 digit number");
}
  }
}
