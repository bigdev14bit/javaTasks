import java.util.Scanner;

public class ValidateUserInput {
  public static void main(String[] args) {
    
  Scanner inputCollector = new Scanner(System.in);

  while(true) {
  System.out.print("Enter a number other than 1 or 2: ");
  int number = inputCollector.nextInt();

  if(number != 1 && number != 2) {
    System.out.println("You enter " + number + " a true value");
    break;
  }
  else {
    System.out.println("Invalid input");
  }
  }
  }
}
