import java.util.Scanner;

public class TaskTwentySeven {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int integer = input.nextInt();

    if (integer % 2 == 0) {
    System.out.println(integer + " is divided by 2");
} 

    if (integer % 3 == 0) {
    System.out.println(integer + " is divided by 3");
}

    if (integer % 5 == 0) {
    System.out.println(integer + " is divided by 5");
}

    if (integer % 7 == 0) {
    System.out.println(integer + " is divided by 7");
}
    if (integer %2 != 0 && integer %3 != 0 && integer %5 != 0 && integer %7 != 0) {
            System.out.println(integer + " is not divisible by 2, 3, 5, or 7");
        }
    }
}
