import java.util.Scanner;

public class TelephoneKeyboard {
  public static void main(String[] args) {
    
  Scanner inputCollector = new Scanner(System.in);

  System.out.print("Enter A Character: ");
  String character = inputCollector.next();

  switch(character) {
     case "a":
     case "b":
     case "c":
     System.out.print("2");
     break;
     case "d":
     case "e":
     case "f":
     System.out.print("3");
     break;
     case ""
}
