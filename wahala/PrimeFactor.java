import java.util.Scanner;

public class PrimeFactors {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int userInput = input.nextInt();

    int sum = 0;
    //System.out.print("Prime factors: ");

    for (int number = 2; number <= userInput; number++) {
      while (userInput % number == 0) {
        System.out.println(number);
	sum = sum + number;
        userInput = userInput / number;
            }
        }
        System.out.println("The sum is: " + sum);
        System.out.print(" ");
    }
}
