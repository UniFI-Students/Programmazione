package javamm;

@SuppressWarnings("all")
public class IsSum {
  public static boolean isSum(int a, int b, int c) {
    return ((((a + b) == c) || ((b + c) == a)) || ((c + a) == b));
  }
  
  public static void main(String[] args) {
  }
}
