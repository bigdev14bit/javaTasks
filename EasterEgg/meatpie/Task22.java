import java.util.Scanner;
public class Task22 {
  public static void main(String[] args) {
    Scanner task = new Scanner(System.in);

    System.out.print("Enter radius: ");
    double radius = task.nextDouble();

    double area = Math.PI * radius * radius;

    System.out.println("Area of circle: " + area);
  }
}
