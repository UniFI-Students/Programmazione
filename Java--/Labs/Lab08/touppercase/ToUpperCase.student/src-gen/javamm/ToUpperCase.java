package javamm;

@SuppressWarnings("all")
public class ToUpperCase {
  public static char[] upperCase(char[] a) {
    char[] res = new char[a.length];
    for (int i = 0; (i < a.length); ++i) {
      boolean _lessEqualsThan = (a[i] <= 'Z');
      if (_lessEqualsThan) {
        res[i] = a[i];
      } else {
        int _minus = (a[i] - 'a');
        int _plus = (_minus + 'A');
        res[i] = ((char) _plus);
      }
    }
    return res;
  }
  
  public static void main(String[] args) {
  }
}
