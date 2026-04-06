import java.util.Scanner;

public class TaskFour {
  public static void main(String[] args) {
    Scanner task = new Scanner(System.in);

    System.out.print("Enter distance in meters: ");
    double meters = task.nextDouble();

    double feet = meters * 3.2786;

    System.out.println(meters + " meters = "+ feet + " feet");
    }
}
