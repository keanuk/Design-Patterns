public class AddOp {
  public void AddOp(char op) {
    if(opN != null) {
      opN.nextOp = new OpNode(ch);
      opN = opN.nextOp;
    }

    else {
      opN = new OpNode(ch);
    }
  }
}
