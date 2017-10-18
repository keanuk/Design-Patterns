public class AddInt {
  public void AddInt(int num) {
    intN = new IntNode(num);

    if(opN != null) {
      opN.children.add(intN);
    }

    else {

    }
  }
}
