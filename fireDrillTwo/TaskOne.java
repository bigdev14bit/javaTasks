import java.util.Scanner;

public class TaskOne {
  public static void main(String[] args) {
    Scanner inputCollector = new Scanner(System.in);

    for(int score = 1; true; score++) {
       if (score == 10) {
          break;
       }
       System.out.println("Enter Score"+ score + " :");
       int scoreInput = inputCollector.nextInt();

       sum += score;
       System.out.println(sum);
    }
  }
}
