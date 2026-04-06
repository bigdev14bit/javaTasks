import java.util.Scanner;

public class Task8 {
  public static void main(String[] args) {
    Scanner sum = new Scanner(System.in);

     System.out.print("Enter Number: ");
    int number = sum.nextInt();

    int square = number * number * number;
   
     System.out.println("The Cube of The Number Is "+ square);
  }
}
