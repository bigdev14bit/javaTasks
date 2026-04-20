import java.util.Scanner;

public class TelephoneKeyboard {
  public static void main(String[] args) {
    
  Scanner inputCollector = new Scanner(System.in);

  System.out.print("Enter A Character: ");
  String character = inputCollector.next();

  if(character == "a" || character == "b" || character == "c") {
     System.out.print("2");
  }
  if(character == "d" || character == "e" || character == "f") {
     System.out.print("3");
  }
  if(character == "g" || character == "h" || character == "i") {
     System.out.print("4");
  }
  if(character == "j" || character == "k" || character == "l") {
     System.out.print("5");
  }
  if(character == "m" || character == "n" || character == "o") {
     System.out.print("6");
  }
  if(character == "p" || character == "q" || character == "r" || character == "s") {
     System.out.print("7");
  }
  if(character == "t" || character == "u" || character == "v") {
     System.out.print(8);
  }
  if(character == "w" || character == "x" || character == "y" || character == "z") {
     System.out.print("90");
  }
  else{
    System.out.print("Invalid character");
  }
  }
}
