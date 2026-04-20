import java.util.Scanner;

public class AverageNumber {
   public static void main(String[] args) {
      Scanner inputCollector = new Scanner(System.in);

      int sum = 0;
      int count = 0;

      while(true) {
        System.out.print("Enter A Number or -1 to quit: ");
	int number = inputCollector.nextInt();

	if(number < 0)
	   break;
	sum += number;
	count ++;
      }
      int average = sum / count;
      System.out.println("\nThe sum is: " + sum);
      System.out.println("The average is: " + average);
   }
}
