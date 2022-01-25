package javamm;

@SuppressWarnings("all")
public class BinaryToDecimal {
  public static long decimal(int[] a) {
    int result = 0;
    int n = a.length;
    for (int i = 0; (i < n); ++i) {
      int _result = result;
      int _doubleLessThan = (a[i] << ((n - i) - 1));
      result = (_result + _doubleLessThan);
    }
    return result;
  }
  
  public static void main(String[] args) {
  }
}
