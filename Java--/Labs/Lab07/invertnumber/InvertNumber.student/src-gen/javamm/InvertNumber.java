package javamm;

@SuppressWarnings("all")
public class InvertNumber {
  public static int invertNumber(int n) {
    int res = 0;
    while ((n > 0)) {
      {
        int _res = res;
        res = (_res * 10);
        int _res_1 = res;
        res = (_res_1 + (n % 10));
        int _n = n;
        n = (_n / 10);
      }
    }
    return res;
  }
  
  public static void main(String[] args) {
  }
}
