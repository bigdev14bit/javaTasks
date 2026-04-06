import java.util.Scanner;

public class TaskTen {
  public static void main(String[] args) {
    Scanner task = new Scanner(System.in);

    System.out.print("Enter water amount (kg): ");
    double Mass = task.nextDouble();

    System.out.print("Enter initial temperature (°C): ");
    double initialTemp = task.nextDouble();

    System.out.print("Enter final temperature (°C): ");
    double finalTemp = task.nextDouble();

    double Quantity= Mass * (finalTemp - initialTemp) * 4184;

    System.out.printf("Energy needed = %.2f Joules%n", Q);
  }
}
 
