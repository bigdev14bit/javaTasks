import java.util.Scanner;

public class BackToSender {
  public static void main(String[] args) {
  
  Scanner inputCollector = new Scanner(System.in);

  System.out.print("Enter Number Of Successful Deliveries: ");
  int numberOfDelivery = inputCollector.nextInt();

  int basePay = 5000;
  int amountPerPercel = 0;

  //less than 50%
  if(numberOfDelivery < 50) {
    amountPerPercel = 160;
  }
  //50 to 59%
  else if(numberOfDelivery > 50 && numberOfDelivery < 59) {
    amountPerPercel = 200;
  }
  //60 to 69%
  else if(numberOfDelivery > 60 && numberOfDelivery < 69) {
    amountPerPercel = 250;
  }
  //70% above
  else if(numberOfDelivery > 70) {
    amountPerPercel = 500;
  }

  int totalWage = (numberOfDelivery * amountPerPercel) + basePay;

  System.out.println("The total wage is: " + totalWage);

  }
}
