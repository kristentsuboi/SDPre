import java.util.Scanner;

public class Objective5Lab4 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int userNumber;

      System.out.println("Please enter a number: ");
      userNumber = scanner.nextInt();
      if(userNumber % 2 == 0) {
        System.out.println("The number is even");
      }
      else {
        System.out.println("The number is odd");
      }
      
      scanner.close();
  }
}