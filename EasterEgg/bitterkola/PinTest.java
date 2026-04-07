import java.util.Scanner;

public class PinTest {
  public static void main(String[] args) {
  System.out.print("  PinTest    \n");

  Scanner input = new Scanner(System.in);

  System.out.print("Enter A 4 Digit Pin: ");
  int pin = input.nextInt();

  if (pin > 1000 && < 9999) {
  System.out.println("VALID PIN");
} else {
  System.out.println("INVALID PIN");
}
  }
}
