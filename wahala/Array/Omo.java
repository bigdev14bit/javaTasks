public class Omo {
  public static void main(String[] args) {
  java.util.Scanner inputCollector = new java.util.Scanner(System.in);

  int[] numbers = new int[10];

  for(int index = 0; index < numbers.length; index++) {

    System.out.print("Enter A Number: ");
    numbers[index] = inputCollector.nextInt();
  }
  for(int indexx = 0; indexx < numbers.length; indexx++) {
    System.out.println("\nNumber saved in " + indexx + " input[" +  numbers[indexx] + "]");
  }


  }
}
