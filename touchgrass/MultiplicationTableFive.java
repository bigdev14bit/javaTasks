public class MultiplicationTableFive {
  public static void main(String[] args) {
    System.out.println("Table\tMultiplication");

    int multiply = 5;

    for(int table = 1; table < 13; table++) {
       int result = multiply * table;
       System.out.println(multiply + " x " + table + "\t" + " = " + result);
    }
  }
}
