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

    System.out.println("\n  **  P  H  O  N  E   B  O  O  K  **  ");
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
		 case 8: System.out.println("\nOPTIONS");
			 System.out.println("1. TYPE OF VIEW");
			 System.out.println("2. Memory Status");

                         System.out.println("\nSelect An OPtion: ");
	                 int choiceMenu = input.nextInt();

                         switch(choiceMenu) {
			   case 0: System.out.println("Back To Phone Book");
				   break;
			   case 1: System.out.println("1. TYPES OF VIEW.");
				   break;
		           case 2: System.out.println("2. MEMORY STATUS.");
				   break;
			   default:
				   System.out.print("  INVALID OPTION  ");
			 }
			 break;
		  case 9: System.out.println("SPEED DIALS");
		           break;
		  case 10: System.out.println("VOICE TAGS");
		           break;
		   default:
			  System.out.print("  INVALID LEARNING  ");
	      }
      }   
      break;

    switch(message) {
      case 2: System.out.println("\n  M  E  S  S  A  G  E  ");
	      case 1: System.out.println("WRITE MESSAGE");
		      System.out.println("INBOX");
		      System.out.println("OUTBOX");
		      System.out.println("PICTURE MESSAGE");
		      System.out.println("TEMPLATES");
		      System.out.println("SMILEYS");
		      System.out.println("MESSAGE SETTINGS");

		      System.out.print("\nSELECT AN OPTION: ");
		      int msgChoice = input.nextInt();
                          
                      switch(msgChoice) {
			 case 1: System.out.println("\n1. WRITE MESSAGE: ");
				 String writeMessage = input.nextLine();
				 System.out.println("\nMESSAGE SENT!!! " + writeMessage);
				 break;
			 case 2: System.out.println("\n2. INBOX");
                                 inboxMessage = """
					        from MTN: Dear customer, Your data bundle remaining 300MB.
				                """;
		                  System.out.println("\nINBOX: " + inboxMessage);
				 break;
                         case 3: System.out.println("\n3. OUTBOX");
				 outboxMessage = """
					        to babe: I miss you.
						""";
				 System.out.println("\nOUTBOX: " + outboxMessage);
				 break;
			 case 4: System.out.println("\n4. PICTURE MESSAGE");
				 noPictureMessage = " No picture message ";
				 System.out.println(noPictureMessage);
				 break;
			 case 5: System.out.println("\n5. TEMPLATES");
				 template = "(^,^)";
				 System.out.println(template);
				 break;
			 case 6: System.out.println("\n6. SMILEYS");
				 smileys = "(^,^)", "<,>", "(**)", "<(*,*)>", "(*_*)", "(<,<)", "(@.@)", "#,#";
				 System.out.println("\nSMILEYS: " + smileys);
                                 break;

			 case 7: System.out.println("\n **7. MESSAGE SETTINGS** ");
				 System.out.println("SELECT AN OPTION: ");
				 System.out.println("SET 1");
				 System.out.println("COMMON");
				 switch(msgChoiceSettings) {
				   case 1: System.out.println("\n1. MESSAGE CENTRE NUMBER");
					   System.out.println("2. MESSAGES SENT AS");
					   System.out.println("3. MESSAGE VALIDITY");
					   break;
				   case 2: System.out.println("\n1. DELIVERY REPORTS");
					   System.out.println("2. REPLY VIA SAME CENTRE");
					   System.out.println("3. CHARACTER SUPPORT");
					   System.out.println("4. INFO SERVICE");
					   System.out.println("5. VOICE MAILBOX NUMBER");
					   System.out.println("6. SERVICE COMMAND EDITOR");
					   break;
                                   case 3: System.out.println(" CHAT ");
                                           break;
				   case 4: System.out.println("CALL REGISTER");
					   System.out.print("SELECT AN OPTION: ");
					   System.out.println("1. MISSED CALL");
					   System.out.println("2. RECEIVED CALL");
					   System.out.println("3. DIALED NUMBER");
					   System.out.println("4. ERASE RECENT CALL LISTS");
					   System.out.println("5. SHOW CALL DURATION");
					   switch(callRegister) {
					      case 1: System.out.println
					   }
				 }
			     }
