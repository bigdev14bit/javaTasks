import java.util.Scanner;

public class BackToSenderMethod {
  public static void main(String[] args) {

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter Number Of Successful Delivery: ");
    int numberOfDelivery = inputCollector.nextInt();

    int totalWage = calculateWage(numberOfDelivery);

    System.out.println("The Total wage is: " + totalWage);
  }

public static int calculateWage(int numberOfDelivery) {
  int amountPerParcel = 0;
  int basePay = 5000; // Base pay is 5,000

  //Less than 50%
  if (numberOfDelivery < 50) {
    amountPerParcel = 160;
  }
  //50% to 59%
  else if (numberOfDelivery >= 50 && numberOfDelivery <= 59) {
    amountPerParcel = 200;
  }
  //60% to 69%
  else if (numberOfDelivery >= 60 && numberOfDelivery <= 69) {
    amountPerParcel = 250;
  }
  //70% and above
  else {
    amountPerParcel = 500;
  }
  return (numberOfDelivery * amountPerParcel) + basePay;
  }
}
