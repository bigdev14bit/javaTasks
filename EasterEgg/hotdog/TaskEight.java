public class TaskEight {
  public static void main(String[] args) {
    Scanner task = new Scanner(System.in);

    System.out.print("Enter number of minutes: ");
    long minutes = task.nextLong();

    long totalDays = minutes / 1440;

    long years = totalDays / 365;

    long remainDays = totalDays % 365;

    System.out.println(minutes + " minutes = " + years + " years and " + remainDays + " days");
  }
}
