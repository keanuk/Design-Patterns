import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("Enter new equation");
    Scanner scanner = new Scanner(System.in);
    String eqn = scanner.nextLine();

    OpNode opN = null;
    IntNode intN = null;

    for(char ch: eqn.toCharArray()) {
      if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
        System.out.println("Math operation found: " + ch);
        AddOp(ch);
      }

      else if(Character.isDigit(ch)) {
        System.out.println("Number found: " + ch);
        AddInt(Character.getNumericValue(ch));
      }

      else {
        System.out.println("Invalid character, please enter a valid equation.\n");
        break;
      }
    }
  }
}
