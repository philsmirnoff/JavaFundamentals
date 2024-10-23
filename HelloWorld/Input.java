package HelloWorld;
import java.util.Scanner;

public class Input {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a text: ");

    String text = input.nextLine();

    System.out.println("You entered: " + text);

    System.out.println("Enter a value: ");

    int value = input.nextInt();

    System.out.println("You entered: " + value);
  }
}
