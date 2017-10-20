import java.math.*;

class EvalVisitor implements Visitor {

  public double EvalEq = 0;

  public EvalVisitor() {

  }

  public double evisit(OpNode oNode) {
    while(oNode != null) {
      for(int i = 0; i < oNode.children.size(); i++) {
        if(EvalEq == 0) {
          EvalEq += (double)oNode.children.get(i).value;
        }
        else if(oNode.operation == '+') {
          EvalEq += (double)oNode.children.get(i).value;
        }
        else if(oNode.operation == '-') {
          EvalEq -= (double)oNode.children.get(i).value;
        }
        else if(oNode.operation == '*') {
          EvalEq = EvalEq * (double)oNode.children.get(i).value;
        }
        else if(oNode.operation == '/') {
          EvalEq = (double)oNode.children.get(i).value / EvalEq;
        }
      }
      oNode = oNode.parent;
    }
    return EvalEq;
  }

  public String ovisit(OpNode oNode) {
    //Do nothing
    return "";
  }
}
