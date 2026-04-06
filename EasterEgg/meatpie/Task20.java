import java.util.Scanner;

public class Task20 {
  public static void main(String[] args) {

    Scanner task = new Scanner(System.in);

    System.out.print("Enter length: ");
    double length = task.nextDouble();

    System.out.print("Enter width: ");
    double width = task.nextDouble();

    System.out.println("Area: " + (length * width));
  }
}
