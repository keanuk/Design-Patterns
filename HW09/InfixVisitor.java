class InfixVisitor implements Visitor {

  public String InfixEq = "";

  public InfixVisitor() {

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
      for(int i = 0; i < oNode.children.size(); i++) {
        InfixEq += oNode.children.get(i).toString();
        if(oNode.nextOp == null && i == (oNode.children.size() - 1))
          break;
        InfixEq += Character.toString(oNode.operation);
      }
      if(oNode.nextOp != null) {
        InfixEq += "(";
        par++;
      }
      oNode = oNode.nextOp;
    }

    for(int i = 0; i < par; i++) {
      InfixEq += ")";
    }

    return InfixEq;
  }
}
