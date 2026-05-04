public class PrimeNumbers {
  public static void main(String[] args) {
 
  int primeNumber = 0;
  int factor = 0;

  for(number = 2; number <= 1200; number++) {
    for(numbers = 2; numbers <= number / 2; numbers++) {
      if(number % numbers == 0) {
        factor++;
      }
    }
  if(factor == 0) {
    System.out.print(number + "\t");
    primeNumber++;
    
    if(primeNumber % 8 == 0) {
      System.out.print();
    }
    }
  } 
  }
}
