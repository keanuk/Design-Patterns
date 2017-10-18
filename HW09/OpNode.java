import java.util.*;

public class OpNode {

  public char operation;
  public ArrayList<IntNode> children = new ArrayList<IntNode>();
  public OpNode nextOp = null;
  public OpNode root = null;

  public OpNode(char operation) {
    this.operation = operation;
  }

}
