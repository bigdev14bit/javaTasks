import java.util.Scanner;

public class Pattern {
  public static void main(String[] args) {

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter number of row: ");
    int number = inputCollector.nextInt();

    for (int index = number; index >= 1; index--) {
            // 1. PRINT SPACES: This pushes the numbers to the right
      for (int space = 0; space < (number - index); space++) {
           System.out.print("   "); // Adjust spaces to match width
            }

            // 2. PRINT NUMBERS
       for (int indexs = 1; indexs <= index; indexs++) {
            System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
