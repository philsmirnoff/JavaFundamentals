package HelloWorld;
import java.util.Scanner;

public class DoWhile {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);

    int value = 0;

    do {
      System.out.println("Enter the value: ");
      value = input.nextInt();
    }
    while(value != 5);
    System.out.println("Got 5!");
  }
}
