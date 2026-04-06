import java.util.Scanner;

public class TemperatureChecker {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.print("Enter A Temperature In Celcius: ");
  int celcius = input.nextInt();

  if (celcius <= 0) {
  System.out.println("FREEZING!!!");
}
  else if (celcius >= 0 && celcius <= 15) {
  System.out.println("COLD!!!");
}
  else if (celcius >= 16 && celcius <= 25) {
  System.out.println("WARM!!!");
} else {
  System.out.println("HOT!!!");
}
  }
}
