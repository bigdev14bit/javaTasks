import java.util.Scanner;

public class Pattern {
  public static void main(String[] args) {
    
  Scanner inputCollector = new Scanner(System.in);

  System.out.print("Enter number of row: ");
  int number = inputCollector.nextInt();

  for(int index = 1; index <= number; index++) {
    for(int indexs = 1; indexs <= index; indexs++) {
        System.out.print(indexs + "* ");
    }
    System.out.println();
  }

  }
}
