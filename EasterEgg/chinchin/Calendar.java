import java.util.Scanner;

public class Calendar {
  public static void main(String[] args) {
    System.out.print(" CALENDAR \n");

    Scanner input = new Scanner(System.in);

    System.out.print("Enter A Number: ");
    int number = input.nextInt();

    if (number == 1) {
    System.out.println("JANUARY!!!");
}
    else if (number == 2) {
    System.out.println("FEBRUARY!!!");
}
    else if (number == 3) {
    System.out.println("MARCH!!!");
}
    else if (number == 4) {
    System.out.println("APRIL!!!");
}
    else if (number == 5) {
    System.out.println("MAY!!!");
}
    else if (number == 6) {
    System.out.println("JUNE!!!");
}
    else if (number == 7) {
    System.out.println("JULY!!!");
}
    else if (number == 8) {
    System.out.println("AUGUST!!!");
}
    else if (number == 9) {
    System.out.println("SEPTEMBER!!!");
}
    else if (number == 10) {
    System.out.println("OCTOMBER!!!");
}
    else if (number == 11) {
    System.out.println("NOVEMBER!!!");
}
    else if (number == 12) {
    System.out.println("DECEMBER!!!");
} else {
    System.out.println("ERROR.");
}
  }
}
