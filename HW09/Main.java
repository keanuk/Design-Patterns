import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("Enter new equation");
    Scanner scanner = new Scanner(System.in);
    String eqn = scanner.nextLine();

    BuildTree bt = new BuildTree();

    char ch [] = eqn.replaceAll(" ", "").toCharArray();

    for(int i = 0; i < ch.length; i++) {
      if(ch[i] == '+' || ch[i] == '-' || ch[i] == '*' || ch[i] == '/') {
        System.out.println("Math operation found: " + ch[i]);
        bt.AddOp(ch, i);
      }

      else if(Character.isDigit(ch[i])) {
        System.out.println("Number found: " + ch[i]);
      }

      else if(ch[i] == "(" || ch[i] == ")") {
        System.out.println("Found parenthesis: " + ch[i]);
      }

      else {
        System.out.println("Invalid character, please enter a valid equation.\n");
        break;
      }
    }
  }
}
