import java.util.Scanner;

public class Objective9Lab3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int selection;

    while(true){
     printMenu();
     selection = scan.nextInt();
     switch (selection) {
      case 1:
        System.out.println("Hello World!");
        break;
      case 2: 
        System.out.println("Tacos, Curry, Sushi");
        break;
      case 3: 
        System.out.println("Goodbye.");
        return;
    }

  }

}
  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}