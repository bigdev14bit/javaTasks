import java.util.Scanner;

public class HourTime {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Current Hour (0-23): ");
    int hour = input.nextInt();

    if (hour >= 0 && hour <= 11) {
      System.out.println("GOOD MORNING!");
  } 
    else if (hour >= 12 && hour <= 17) {
       System.out.println("GOOD AFTERNOON!");
  } 
     else if (hour >= 18 && hour <= 21) {
       System.out.println("GOOD EVENING!");
  } 
     else if (hour >= 22 && hour <= 23 || hour >= 0 && hour <= 4) {
        System.out.println("GOOD NIGHT!");
  } 
     else {
        System.out.println("INVALID HOUR!!");
  }

  }
}
