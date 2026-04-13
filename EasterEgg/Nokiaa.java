import java.util.Scanner;
public class Nokiaa {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("  ******************************  ");
    System.out.println("  ******************************  ");
    System.out.println("  *                            *  ");
    System.out.println("  N  O  K  I  A  3  3  1  0  ");
    System.out.println("  *                            *  ");
    System.out.println("  ******************************  ");
    System.out.println("  ******************************  ");

    System.out.println("  \nWecome   To   Nokia   ");
    System.out.println("1. PHONE   BOOK");
    System.out.println("2. MESSAGES");
    System.out.println("3. CHAT");
    System.out.println("4. CALL REGISTER");
    System.out.println("5. TONES");
    System.out.println("6. SETTINGS");
    System.out.println("7. CALL DIVERT");
    System.out.println("8. GAMES");
    System.out.println("9. CALCULATOR");
    System.out.println("10. REMAINDERS");
    System.out.println("11. CLOCK");
    System.out.println("12. PROFILES");
    System.out.println("13. SIM SERVICES");

    System.out.print("\nENTER  An Option TO  CONTINUE: ");
    int menu = input.nextInt();

    switch(menu) {
      case 1: System.out.println("1. SEARCH");
              System.out.println("2. SERVICE Nos");
              System.out.println("3. ADD NAME.");
              System.out.println("4. ERASE.");
              System.out.println("5. EDIT.");
              System.out.println("6. ASSIGN TONE.");
              System.out.println("7. SEND b'card.");
              System.out.println("8. OPTIONS.");
	      System.out.println("9. SPEED DIALS.");
	      System.out.println("10. VOICE TAGS.");

	      System.out.print("\nEnter An Option: ");
	      int choice = input.nextInt();

	      switch(choice) {
	         case 1: System.out.println("SEARCH");
			 break;
		 case 2: System.out.println("SERVICE NOs");
			 break;
		 case 3: System.out.println("ADD NAME");
			 break;
		 case 4: System.out.println("ERASE");
			 break;
		 case 5: System.out.println("EDIT");
			 break;
		 case 6: System.out.println("ASSIGN TONE");
			 break;
		 case 7: System.out.println("SEND b'card");
			 break;
		 case 8: System.out.println("OPTIONS");

	      int choiceMenu = input.nextInt();		 
                         switch(choiceMenu) {
			   case 1: System.out.println("1. TYPES OF VIEW.");
				   System.out.println("2. MEMORY STATUS.");

				   System.out.println("Enter An Option: ");
				   int menuChoice = input.nextInt();

				   switch(menuChoice) {
				     case 1: System.out.println("TYPE OF MEMORY");
					     break;
				     case 2: System.out.println("MEMORY STATUS");
					     break;
				   }
			 }
		 case 9: System.out.println("SPEED DIALS");
			 break;
		 case 10: System.out.println("VOICE TAGS");
			  break;
	      }
      }   
      System.out.println("Enter An Option: ");
      int messageMenu = input.nextInt();

         switch(messageMenu) {
	   case 1: System.out.println("
	 }	 
  }
}
