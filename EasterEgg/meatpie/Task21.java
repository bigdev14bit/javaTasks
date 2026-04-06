import java.util.Scanner;

public class Triangle {
  public static void main(String[] args) {
    Scanner task = new Scanner(System.in);

    System.out.print("Enter base: ");
    double base = task.nextDouble();

    System.out.print("Enter height: ");
    double height = task.nextDouble();

    double area = 0.5 * base * height;

    System.out.println("Area of triangle: " + area);
  }
}
