package javamm;

@SuppressWarnings("all")
public class ScalarProduct {
  public static int scalarProduct(int[] a, int[] b) {
    int result = 0;
    for (int i = 0; (i < a.length); ++i) {
      int _result = result;
      int _multiply = (a[i] * b[i]);
      result = (_result + _multiply);
    }
    return result;
  }
  
  public static void main(String[] args) {
  }
}
