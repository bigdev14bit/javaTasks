import java.util.Scanner;

public class Loop5 {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.print("Enter Number: ");
  int n = input.nextInt();

  int i = 1;
  
  while (i <= n) {
  System.out.println(i);
  i++;
}
  }
}
