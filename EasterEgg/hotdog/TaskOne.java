import java.util.Scanner;

public class TaskOne {
  public static void main(String[] args) {
    Scanner taskOne = new Scanner(System.in);

    System.out.print("Enter distance in miles: ");
    double miles = taskOne.nextDouble();

    double km = miles * 1.6;
    System.out.println(miles + " miles = " + km + " kilometers");
  }
}
 
