package javamm;

@SuppressWarnings("all")
public class IntegerSquareRoot {
  public static int integerSquareRoot(int n) {
    int x = 1;
    while (((x * x) <= n)) {
      ++x;
    }
    return (x - 1);
  }
  
  public static void main(String[] args) {
  }
}
