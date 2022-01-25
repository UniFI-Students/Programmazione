package javamm;

@SuppressWarnings("all")
public class Range {
  public static boolean range(int n, int l, int r, boolean o) {
    boolean _xjconditionalexpression = false;
    if (o) {
      _xjconditionalexpression = ((n < l) || (n > r));
    } else {
      _xjconditionalexpression = ((n >= l) && (n <= r));
    }
    return _xjconditionalexpression;
  }
  
  public static void main(String[] args) {
  }
}
