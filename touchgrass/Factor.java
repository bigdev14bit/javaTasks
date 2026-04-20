import java.util.Scanner;

public class Factor {
  public static void main(String[] args) {
   
    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter A Number To Find It's Factor: ");
    int number = inputCollector.nextInt();

    for(int factor = 1; factor <= number; factor++) {
      if(number % factor == 0) {
        System.out.println(factor);
      }
    }
  }
}
