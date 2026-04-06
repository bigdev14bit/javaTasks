import java.util.Scanner;

public class AtmSimulation {
  public static void main(String[] args) {
  System.out.println("|| WELCOME ||\n");  

  Scanner input = new Scanner(System.in);

  System.out.print("Enter Pin: ");
  int pin = input.nextInt();

  long amount = 1_000_000_000;

  if (pin == 1234) {
  System.out.println("Your Balance is "+ "$"+ amount);
}  
  else if (pin != 1234) {
  System.out.println("Incorrect Pin");
}
  }
}
