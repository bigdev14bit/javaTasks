import java.util.Scanner;

public class TaskSix {
  public static void main(String[] args) {
    Scanner task = new Scanner(System.in);

    System.out.print("Enter subtotal: ");
    double subtotal = task.nextDouble();

    System.out.print("Enter gratuity rate (%): ");
    double rate = task.nextDouble();

    double gratuity = subtotal * (rate / 100);

    double total  = subtotal + gratuity;

    System.out.printf("Gratuity = $%.2f%n", gratuity);

    System.out.printf("Total  = $%.2f%n", total);
  }
}
