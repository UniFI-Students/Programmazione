package javamm;

@SuppressWarnings("all")
public class Party {
  public static boolean party(int c, boolean s) {
    boolean _xjconditionalexpression = false;
    if (s) {
      _xjconditionalexpression = (c <= 100);
    } else {
      _xjconditionalexpression = (c <= 40);
    }
    return _xjconditionalexpression;
  }
  
  public static void main(String[] args) {
  }
}
