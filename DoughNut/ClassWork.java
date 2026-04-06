import java.util.Scanner;

public class ClassWork {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.print("Enter Name: ");
  String name = input.next();

  System.out.print("Enter Age: ");
  int age = input.nextInt();

  System.out.printf("Welcome,  %s, you're , %d, yr's old\n", name, age);
//  System.out.println("Welcome, "+ name + " you're "+ age + "yr's old");

  }
}
