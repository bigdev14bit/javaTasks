public class PositiveNum {
  public int positive(int numberOne, int numberTwo) {
  if(numberOne > numberTwo) {
  return numberOne - numberTwo;
   } else {
   return numberTwo - numberOne;
   }
  }
public static void main(String[] args) {
PositiveNum get = new PositiveNum();
  System.out.println(get.positive(11, 19));
  }
}
