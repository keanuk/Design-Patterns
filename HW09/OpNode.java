import java.util.*;

public class OpNode {

  public char operation;
  public ArrayList<IntNode> children = new ArrayList<IntNode>();
  public OpNode nextOp = null;
  public OpNode parent = null;

  public OpNode(char operation) {
    this.operation = operation;
  }

  public String accept(Visitor visitor) {
    return visitor.ovisit(this);
  }

  public double acceptd(Visitor visitor) {
    return visitor.evisit(this);
  }

}
