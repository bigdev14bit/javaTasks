import java.util.Scanner;

public class Reserve_Number {
  public static void main(String[] args) {
    
  Scanner inputCollector = new Scanner(System.in);

  System.out.print("Enter a 5 digit number: ");
  int user_input = inputCollector.nextInt();

  while(number > 0) {
     extract = user_input % 10;
     System.out.print(extract);
     reduce = (user_input / 10);
     user_input = reduce;
  }
  }
}

//user_input = int(input("Enter a 5 digit number: "))

//while user_input > 0:
  // extract = user_input % 10
   //print(extract)
   //reduuce = int(user_input / 10)
   //user_input = reduuce
