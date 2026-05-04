import java.util.Scanner;

public class PizzaWahala {
  public static void main(String[] args) {

    Scanner inputCollector = new Scanner(System.in);

while(true) {
    System.out.println("""
******************************************************
******************************************************
***                        ***
*** WELCOME TO TOTZY PIZZA ***
***                        ***
******************************************************
******************************************************
    """
    );

    System.out.println("""
----------------------------------------------------
----------------------------------------------------
    """
    );

    System.out.println("""
**                                **
**  WHAT WOULD YOU LIKE TO ORDER  **
**                                **
    """
    );

    System.out.println("""
----------------------------------------------------
----------------------------------------------------
    """
    );    

    System.out.println("\n    PIZZA TYPE    NUMBER OF SLICE   PRICE PER BOX");

    System.out.println("""
    1. Sapa Size         4              2,500
    2. Small Money       6              2,900
    3. Big Boys          8              4,000
    4. Odogwu           12              5,200
   """
);
    System.out.print("\nEnter Number Of People: ");
    int numberOfGuest = inputCollector.nextInt();
    
    inputCollector.nextLine(); 

    System.out.print("Enter Pizza Type: ");
    String pizzaType = inputCollector.nextLine().toLowerCase();

    int numberOfSlice = 0;
    int pricePerBox = 0;

    if(pizzaType.equals("sapa size")) {
      numberOfSlice = 4;
      pricePerBox = 2500;
    }
    else if(pizzaType.equals("small money")) {
      numberOfSlice = 6;
      pricePerBox = 2900;
    }
    else if(pizzaType.equals("big boys")) {
      numberOfSlice = 8;
      pricePerBox = 4000;
    }
    else if(pizzaType.equals("odogwu")) {
      numberOfSlice = 12;
      pricePerBox = 5200;
    }

    int numberOfBoxes = (numberOfGuest + numberOfSlice - 1) / numberOfSlice;

    int totalSlices = numberOfBoxes * numberOfSlice;
    int leftovers = totalSlices - numberOfGuest;

    int totalPrice = numberOfBoxes * pricePerBox;

    System.out.println("\n--- ORDER DETAILS ---");
    System.out.println("Number of boxes of pizza to buy = " + numberOfBoxes + " boxes");
    System.out.println("Number left over slices after serving = " + leftovers + " slices");
    System.out.println("Price = " + totalPrice);
    }
  }
}
