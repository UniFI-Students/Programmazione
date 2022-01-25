package javamm;

@SuppressWarnings("all")
public class DuplicateDigit {
  public static long duplicateDigit(int n) {
    long result = 0;
    long currentFactor = 1;
    while ((n > 0)) {
      {
        for (int i = 0; (i < 2); ++i) {
          {
            long _result = result;
            result = (_result + ((n % 10) * currentFactor));
            long _currentFactor = currentFactor;
            currentFactor = (_currentFactor * 10);
          }
        }
        int _n = n;
        n = (_n / 10);
      }
    }
    return result;
  }
  
  public static void main(String[] args) {
  }
}
