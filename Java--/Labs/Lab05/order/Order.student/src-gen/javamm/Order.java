package javamm;

@SuppressWarnings("all")
public class Order {
  public static boolean order(int a, int b, int c, boolean noA) {
    boolean _xjconditionalexpression = false;
    if (noA) {
      _xjconditionalexpression = (b < c);
    } else {
      _xjconditionalexpression = ((a < b) && (b < c));
    }
    return _xjconditionalexpression;
  }
  
  public static void main(String[] args) {
  }
}
