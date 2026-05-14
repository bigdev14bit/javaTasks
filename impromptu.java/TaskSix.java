import java.util.Scanner;

public class TaskSix {
  public static void main(String[] args) {
    Scanner inputCollector = new Scanner(System.in);

    int evenIndex = 0;

    for(int score = 1; score <= 10; score++) {
          
       
       System.out.println("Enter Score " + score + ":");
       int scoreInput = inputCollector.nextInt();
       if (scoreInput % 2 == 0) {
}
        evenIndex += scoreInput;
    }
      double average = evenIndex / 10.0;
      System.out.println("Sum of the even number is: " + evenIndex);
  }
}
