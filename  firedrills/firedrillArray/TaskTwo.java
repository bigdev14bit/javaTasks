public class TaskOne {
  public static void main(String[] args) {

  java.util.Scanner inputCollector = new java.util.Scanner(System.in);

  int[] totalScore = new int[10];

  int count = 0;

  for(int index = 0; index < totalScore.length; index++) {

    System.out.print("Enter Score: ");
    int userInput = inputCollector.nextInt();

    totalScore[index] = userInput;

    System.out.println(java.util.Arrays.toString(totalScore));


  } 
  for(int indexx : totalScore) {
    System.out.print(indexx);
  }
  System.out.println();
 }
}

