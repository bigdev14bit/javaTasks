public class RangeInArray {

  public static int range(int[] numbers) {

    //int[] numbers = {1, 20, 33, 21, 6, 4};

    int minimum = numbers[0];
    int maximum = numbers[0];

    //for(int index = 0; index < numbers.length; index++) {
      for(int number : numbers) {
      if(numbers > maximum) {
        maximum = numbers;
	//return maximum;
      }
      if(numbers < minimum) {
        minimum = numbers;
	//return maximum - minimum;
      }
    }
    return maximum - minimum;
  }
 public static void main(String... args) {

  int[] numbers = {1, 20, 100, 21, 6, 4};

  int result = range(numbers);
  System.out.println("The Result is: " + result);
 }
}
