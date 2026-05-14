import java.util.Scanner;

public class TaskFour {
  public static void main(String[] args) {
    Scanner inputCollector = new Scanner(System.in);

    int evenIndexSum = 0;

    for(int score = 1; score <= 10; score++) {
          
       
       System.out.println("Enter Score " + score + ":");
       int scoreInput = inputCollector.nextInt();
       if (scoreInput % 2 == 0) {
}
        evenIndexSum += scoreInput;
    }
      System.out.println("Sum of Index At Even Is: " + evenIndexSum);
  }
}
