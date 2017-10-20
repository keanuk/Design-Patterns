public class BuildTree {

  OpNode opN = null;
  IntNode intN = null;
  char lastOp;

  public void AddInt(int num) {
    intN = new IntNode(num);
    opN.children.add(intN);
  }

  public OpNode AddOp(char[] ch, int index) {
    if(ch[index] == lastOp) {
      if(ch[index + 1] == '(') {
        //Do nothing
      }
      else if(Character.isDigit(ch[index + 1])) {
        AddInt(Character.getNumericValue(ch[index + 1]));
    }
  }

    else if(opN != null) {
      opN.nextOp = new OpNode(ch[index]);
      opN.nextOp.parent = opN;
      opN = opN.nextOp;
      AddInt(Character.getNumericValue(ch[index - 1]));
      if(ch[index + 1] == '(') {
        //Do nothing
      }
      else if(Character.isDigit(ch[index + 1])) {
        AddInt(Character.getNumericValue(ch[index + 1]));
      }
    }

    else {
      opN = new OpNode(ch[index]);
      AddInt(Character.getNumericValue(ch[index - 1]));

      if(ch[index + 1] == '(') {
        //Do nothing
      }

      else if(Character.isDigit(ch[index + 1])) {
        AddInt(Character.getNumericValue(ch[index + 1]));
      }
    }
    lastOp = ch[index];
    return opN;
  }
}
