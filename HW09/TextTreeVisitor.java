class TextTreeVisitor implements Visitor {

  public String TextEq = "";
  public String indent = " ";

  public TextTreeVisitor() {

  }

  public double evisit(OpNode oNode) {
    //Do nothing
    return 0;
  }

  public String ovisit(OpNode oNode) {

    while(oNode.parent != null) {
      oNode = oNode.parent;
    }

    while(oNode != null) {
      if(oNode.parent == null)
        TextEq += "[" + Character.toString(oNode.operation) + "]";
      for(int i = 0; i < oNode.children.size(); i++) {
        //Append very first number in equation
        TextEq += "\n" + indent + "+---[" + oNode.children.get(i).toString() + "]";
      }
      oNode = oNode.nextOp;
      if(oNode != null)
        TextEq += "\n" + indent + "+---[" + Character.toString(oNode.operation) + "]";
      indent += "     ";
    }

    return TextEq;
  }
}
