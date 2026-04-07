import java.util.Scanner;

public class FuzzBuzz {
  public static void main(String[] args) {
  System.out.print("  FuzzBuzz    \n");

  Scanner input = new Scanner(System.in);

  System.out.print("Enter A Number: ");
  int firstNumber = input.nextInt();

  if (firstNumber % 3 == 0 && firstNumber % 5 == 0) {
  System.out.println("FUZZBUZZ");
} 
  if (firstNumber % 3 == 0) {
  System.out.println("FUZZ");
}
  if (firstNumber % 5 == 0) {
  System.out.println("BUZZ");
}
  else {
  System.out.println(firstNumber + " is unfortunate");
}
  }
}
