package javamm;

@SuppressWarnings("all")
public class FirstLastDigitSum {
  public static int firstLastDigitSum(int n) {
    int sum = (n % 10);
    while ((n > 9)) {
      int _n = n;
      n = (_n / 10);
    }
    return (sum + n);
  }
  
  public static void main(String[] args) {
  }
}
