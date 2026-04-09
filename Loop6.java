import java.util.Scanner;

public class Loop6 {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.print("Enter Number: ");
  int n = input.nextInt();

  int sum = 0;
  for (int i = 1; i < n; i++)

  sum = sum + 1;
  System.out.println(sum);
  }
}
