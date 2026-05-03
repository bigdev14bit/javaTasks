public class MenstrualApp {
  public static void main(String... args) {

  java.util.Scanner inputCollector = new java.util.Scanner(System.in);

  // Storage for menstruation app.
  String[] userRegistration = new String[4];

  String menus = ("""
          1. Registration.
          2. Login.
          3. Account Status.
          4. Track your menstrual cycle.
          5. Tips on personal hygiene.
          6. exit().
          """
  );

  String registration = (("\n") + """
          1. Enter First Name.
          2. Enter Second Name.
          3. Enter Email.
          4. Enter Password.
          """
  );

  String welcomeScreen = (("\n") + """

**********************************************************************************************************************
**********************************************************************************************************************

**                          **   *************   **                     **         **  **      **     **   ************
**                        **    *************   **                    **         **    **     ***    **   ************
**                      **     **              **                   **         **      **    ** *  * *   **
**                    **      **              **                  **         **        **   **  **  *   **
**                  **       *************   **                 **         **         **   **     **   ************
**      * *       **        *************   **                **         **          **   **     **   ************
**     * *      **         **              **                **         **         **    **     **   **
******* *******           *************   ************       **         ******** **     **     **   ************
****** *******           *************   ************        **         ********       **     **   ************

***********************************************************************************************************************
***********************************************************************************************************************
                  """);

  System.out.println("\nMenstra Cycle Tracka-app");

  System.out.println(welcomeScreen);
  System.out.print(menus);

  while(true) {

    System.out.print("\nEnter An Option 1 - 6: ");
    int option = inputCollector.nextInt();

    if(option == 6) {
      System.out.println("\nThank You");
      break;
    } // quit state code

    if(option == 1) {

      System.out.print(registration);

      inputCollector.nextLine();

      System.out.print("\nEnter First Name: ");
      String firstName = inputCollector.nextLine();

      System.out.print("Enter Second Name: ");
      String secondName = inputCollector.nextLine();

      String email;
      while(true) {
        System.out.print("Enter EMAIL: ");
        email = inputCollector.nextLine();
        if(email.contains("@")) {
          System.out.println("\nValid email");
          break;
        } else {
          System.out.println("\nInvalid email");
        }
      }

      String passWord;
        while(true) {
          System.out.print("\nEnter PassWord: ");
          passWord = inputCollector.nextLine();
          if(passWord.length() < 8) {
            System.out.println("\nPassword Less than 8");
          } else {
            System.out.println("\nStrong Password");
            break;
          }
        }

        userRegistration[0] = firstName;
        userRegistration[1] = secondName;
        userRegistration[2] = email;
        userRegistration[3] = passWord;

        System.out.println("\nRegistraion SuccessFul");
      } // end of first if statement.

      if(option == 2) {

        inputCollector.nextLine();

        if(userRegistration[0] == null || userRegistration[1] == null ||
           userRegistration[2] == null || userRegistration[3] == null) {
          System.out.print("You're not registered, Register First.");
          continue;
        }

        System.out.print("\n******************************************************************");
        System.out.print(" \n*********************** L.O.G.I.N ****************************** ");
        System.out.print("\n******************************************************************");

        String email;
        String passWord;

        while(true) {
          System.out.print("\nEnter Email: ");
          email = inputCollector.nextLine();

          System.out.print("Enter PassWord: ");
          passWord = inputCollector.nextLine();

          if(email.equals(userRegistration[2]) && passWord.equals(userRegistration[3])) {
            System.out.print("\nLogin Successful");
            break;
          } else {
            System.out.print("\nInvalid Email And PassWord, Try Again.");
          }
        }
      } // end of second if statement.

      if(option == 3) {
        
        inputCollector.nextLine();

	if(userRegistration[0] == null || userRegistration[1] == null || userRegistration[2] == null || userRegistration[3] == null) {
	  System.out.print("\nNo Account Found, please register");
	continue;  
        }
     
	System.out.println("=================================");
	System.out.println("\n  A.C.C.O.U.N.T	S.T.A.T.U.S  ");
	System.out.println("=================================");
	System.out.println("First Name: " + userRegistration[0]);
	System.out.println("Second Name: " + userRegistration[1]);
	System.out.println("Email: " + userRegistration[2]);
	System.out.println("PassWord: " + userRegistration[3]); //in real production, passWord won't be shown.
      }  // end of third if statement.

      if(option == 4) {
        
        inputCollector.nextLine();

	if(userRegistration[2] == null || userRegistration[3] == null) {
	  System.out.print("Register, or login first");
	  continue;
	}

	System.out.println("===================================================================================");
	System.out.println("  \n==  T.R.A.C.K	      Y.O.U.R		M.E.N.S.T.R.U.A.L.	C.Y.C.L.E  ==  ");
	System.out.println("===================================================================================");
        System.out.print("ENTER FIRST DAY OF LAST PERIOD( 1 - 30 ): ");
	int lastDayOfPeriod = inputCollector.nextInt();

	System.out.print("ENTER CYCLE OF YOUR PERIOD( e,g: 28):  ");
	int cycleOfPeriod = inputCollector.nextInt();

	                //calculation
	//NEXT PERIOD
	int nextPeriod = lastDayOfPeriod + cycleOfPeriod;
	while(nextPeriod > 30) {
	  nextPeriod = nextPeriod - 30;
	}

	//OVULATION
        int ovulationDay = nextPeriod - 14;
        while(ovulationDay <= 0) {
	  ovulationDay = ovulationDay + 30;
	}

	//FERTILE WINDOW START 'N STOP
	int fertileWindowStart = ovulationDay - 3;
	while(fertileWindowStart <= 0) {
	  fertileWindowStart = fertileWindowStart + 30;
	}

	int fertileWindowStop = ovulationDay + 2;
	while(fertileWindowStop > 30) {
	  fertileWindowStop = fertileWindowStop - 30;
	}

	// results
	System.out.println(" \n========== R E S U L T ============ ");

	// RESULTS
	System.out.println("Next Period Day: " + nextPeriod);
	System.out.println("Ovulation Day: " + ovulationDay);
	System.out.println("Fertile Window: " + fertileWindowStart + "-" + fertileWindowStop + " that is " + (fertileWindowStart - fertileWindowStop) + " days");

	System.out.println(" ========== R E S U L T ============ ");
      } // end of forth if statement.

// ARIGA THANKS
// *(^,^)*

    } // while loop ends

  } // main ends

} // class ends
