import java.util.Scanner;

public class TaskTwo {
  public static void main(String[] args) {
    Scanner task = new Scanner(System.in);

    System.out.print("Enter the length of a side: ");
    double side = task.nextDouble();

    double area = (Math.sqrt(3) / 4) * side * side;

    System.out.printf("Area of equilateral triangle = %.2f%n", area);
  }
}
