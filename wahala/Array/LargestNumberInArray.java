public class LargestNumberInArray {
  public static int getLargest(int[] numbers) {

  int maximum = numbers[0];

  for (int index = 1; index < numbers.length; index++) {
    if (numbers[index] > maximum) {
      maximum = numbers[index];
    }
  }
      return maximum;
}

public static void main(String[] args) {
  int[] myNumbers = {22, 32, 52, 10, 33, 100};
        
  int result = getLargest(myNumbers);
        
  System.out.println("The largest number is: " + result);
  }
}
