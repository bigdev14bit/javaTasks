import java.util.Scanner;

public class TaskFive {
  public static void main(String[] args) {
    Scanner task = new Scanner(System.in);

    System.out.print("Enter Area In Square Meters: ");
    double squareMeters = task.nextDouble();

    double ping = squareMeters * 0.3025;
    System.out.println(squareMeters + " squareMeters = "+ ping + " ping");
  }
}
 
