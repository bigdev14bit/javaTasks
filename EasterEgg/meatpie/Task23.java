import java.util.Scanner;

public class Task23 {
  public static void main(String[] args) {
  
  Scanner task = new Scanner(System.in);

  System.out.print("Enter First Name: ");
  String firstName = task.next();

  System.out.print("Enter Second Name: ");
  String secondName = task.next();

  System.out.println("N: "+ (firstName+secondName));
  }
}

