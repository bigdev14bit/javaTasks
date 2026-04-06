import java.util.Scanner;

public class Task3 {
  public static void main(String[] args) {
    Scanner task = new Scanner(System.in);

    System.out.print("Enter the length of a side of the triangle: ");
    double side = task.nextDouble();

    System.out.print("Enter the length (depth) of the prism: ");
    double length = task.nextDouble();

    double area   = (Math.sqrt(3) / 4) * side * side;

    double volume = area * length;

    System.out.printf("Volume of triangular prism = %.2f%n", volume);
    }
}
