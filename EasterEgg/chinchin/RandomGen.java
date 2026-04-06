import java.util.Random;

public class RandomGen {
  public static void main(String[] args) {
    System.out.println("Random Rainbow Generator");
    
    Random rainbowGen = new Random();

    int rainbow = rainbowGen.nextInt(7);

    if (rainbow == 1) {
    System.out.println("RED!!!");
}
    else if (rainbow == 2) {
    System.out.println("ORANGE!!!");
}   
    else if (rainbow == 3) {
    System.out.println("YELLOW!!!");
}
    else if (rainbow == 4) {
    System.out.println("GREEN!!!");
}
    else if (rainbow == 5) {
    System.out.println("BLUE!!!");
}
    else if (rainbow == 6) {
    System.out.println("INDIGO!!!");
}
    else if (rainbow == 7) {
    System.out.println("VIOLET!!!");
}

  }
}
