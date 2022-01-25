package javamm;

@SuppressWarnings("all")
public class ArraySum {
  public static int[] arraySum(int[] a, int[] b) {
    int[] result = new int[a.length];
    for (int i = 0; (i < a.length); ++i) {
      int _plus = (a[i] + b[i]);
      result[i] = _plus;
    }
    return result;
  }
  
  public static void main(String[] args) {
  }
}
