package javamm;

@SuppressWarnings("all")
public class PalindromeArray {
  public static boolean palindrome(int[] a) {
    int n = a.length;
    for (int i = 0; (i < (n >> 1)); ++i) {
      boolean _tripleNotEquals = (a[i] != a[((n - i) - 1)]);
      if (_tripleNotEquals) {
        return false;
      }
    }
    return true;
  }
  
  public static void main(String[] args) {
  }
}
