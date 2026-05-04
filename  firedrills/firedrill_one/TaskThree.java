//coming back for you
import java.util.Scanner;

public class TaskThree {
  public static void main(String[] args) {
    Scanner inputCollector = new Scanner(System.in);

    int sum = 0;

    for(int score = 1; score <= 10; score++) {
          
       
       System.out.println("Enter Score " + score + ":");
       int scoreInput = inputCollector.nextInt();

        sum += scoreInput;
    }
      double average = sum / 10;
      System.out.println("Sum: " + sum);
      System.out.println("Average: " + average);
  }
}
