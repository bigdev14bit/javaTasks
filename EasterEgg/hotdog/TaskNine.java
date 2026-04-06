import java.util.Scanner;

public class TaskNine {
  public static void main(String[] args) {
    Scanner task = new Scanner(System.in);

    System.out.print("Enter initial velocity u (m/s): ");
    double initialVelocity = task.nextDouble();

    System.out.print("Enter time t (seconds): ");
    double time = task.nextDouble();

    System.out.print("Enter acceleration a (m/s²): ");
    double acceleration = task.nextDouble();

    double distance = initialVelocity * time + 0.5 * acceleration * time * time;

    System.out.println("Distance covered = " + distance + " meters");
  }
}
