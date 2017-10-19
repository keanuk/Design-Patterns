public interface Visitor {
  public String visit(Infix ifx);
  public String visit(LispEx lspx);
  public double visit(TreeValue trvl);
  public String visit(TextTree txttr);
}
