class LispExVisitor implements Visitor {

  public String LispEq = "";

  public LispExVisitor() {

  }

  public double evisit(OpNode oNode) {
    //Do nothing
    return 0;
  }

  public String ovisit(OpNode oNode) {
    int par = 0;

    while(oNode.parent != null) {
      oNode = oNode.parent;
    }

    while(oNode != null) {
      LispEq += "(";
      LispEq += Character.toString(oNode.operation);
      par++;
      for(int i = 0; i < oNode.children.size(); i++) {
        //Append very first number in equation
        LispEq += oNode.children.get(i).toString();
      }
      oNode = oNode.nextOp;
    }

    for(int i = 0; i < par; i++) {
      LispEq += ")";
    }

    return LispEq;
  }
}
