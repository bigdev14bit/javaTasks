import java.util.Scanner;

public class Time {
  public static void main(String[] args) {
  System.out.print("T    I    M    E  \n");

  Scanner input = new Scanner(System.in);

  System.out.print("Enter Hour: ");
  int firstHour = input.nextInt();

  System.out.print("Enter Minute: ");
  int firstMinute = input.nextInt();

  System.out.print("Enter Hour: ");
  int secondHour = input.nextInt();

  System.out.print("Enter Minute: ");
  int secondMinute = input.nextInt();

  int totalMinute = firstMinute + secondMinute;
  int carryHours = totalMinute / 60;
  int finalMinutes = totalMinute % 60;
  int finalHours = firstHour + secondHour + carryHours;

  System.out.println("Total Time: " + finalHours + "hrs " + finalMinutes + "mins");
  }
}
