public class BuildTree {

  OpNode opN = null;
  IntNode intN = null;
  char lastOp;

  public void AddInt(int num) {
    intN = new IntNode(num);
    opN.children.add(intN);
  }

  public void AddOp(char[] ch, int index) {
    if(ch[index] == lastOp) {
      AddInt(Character.getNumericValue(ch[index + 1]));
    }

    else if(opN != null) {
      opN.nextOp = new OpNode(ch[index]);
      opN = opN.nextOp;
    }

    else {
      opN = new OpNode(ch[index]);
      AddInt(Character.getNumericValue(ch[index - 1]));

      if(Character.isDigit(ch[index + 1])) {
        AddInt(Character.getNumericValue(ch[index + 1]));
      }
    }
  }
}
