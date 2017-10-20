import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("Enter new equation");
    Scanner scanner = new Scanner(System.in);
    String eqn = scanner.nextLine();
    scanner.close();

    BuildTree bt = new BuildTree();

    OpNode eqTree = null;

    char ch [] = eqn.replaceAll(" ", "").toCharArray();

    for(int i = 0; i < ch.length; i++) {
      if(ch[i] == '+' || ch[i] == '-' || ch[i] == '*' || ch[i] == '/') {
        eqTree = bt.AddOp(ch, i);
      }

      else if(Character.isDigit(ch[i])) {
      }

      else if(ch[i] == '(' || ch[i] == ')') {
        //Do nothing
      }

      else {
        System.out.println("Invalid character, please enter a valid equation.\n");
        break;
      }
    }

    InfixVisitor ifx = new InfixVisitor();
    LispExVisitor lex = new LispExVisitor();
    EvalVisitor evl = new EvalVisitor();
    TextTreeVisitor ttr = new TextTreeVisitor();

    System.out.println("\nInfix Visitor:\n" + eqTree.accept(ifx));
    System.out.println("\nLisp Expression Visitor:\n" + eqTree.accept(lex));
    System.out.println("\nEvaluated Visitor:\n" + eqTree.acceptd(evl));
    System.out.println("\nText Tree Visitor:\n" + eqTree.accept(ttr));
  }
}
