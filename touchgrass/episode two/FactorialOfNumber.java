public class FactorialOfNumber {
  public int getFactorialOf(int integer) {

    long result = 1;
    for(int index = 1; index <= integer; index++) {
      result *= index;
    return result;
}
}
public static void main(String[] args) {
  System.out.print("The factorial of 20 is: " + getFactorialOf);
}
}
