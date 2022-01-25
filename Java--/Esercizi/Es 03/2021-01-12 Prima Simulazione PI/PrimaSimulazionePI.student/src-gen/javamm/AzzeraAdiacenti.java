package javamm;

@SuppressWarnings("all")
public class AzzeraAdiacenti {
  public static int[][] azzeraAdiacenti(int[][] T, int r, int c) {
    int n = T.length;
    int m = T[0].length;
    for (int i = -1; (i <= 1); ++i) {
      {
        T[AzzeraAdiacenti.TakeAdjasent(n, r, -1)][AzzeraAdiacenti.TakeAdjasent(m, c, i)] = 0;
        T[AzzeraAdiacenti.TakeAdjasent(n, r, 1)][AzzeraAdiacenti.TakeAdjasent(m, c, i)] = 0;
      }
    }
    T[r][AzzeraAdiacenti.TakeAdjasent(m, c, -1)] = 0;
    T[r][AzzeraAdiacenti.TakeAdjasent(m, c, 1)] = 0;
    return T;
  }
  
  public static int TakeAdjasent(int n, int r, int addI) {
    int _r = r;
    r = (_r + addI);
    if ((r < 0)) {
      int _r_1 = r;
      r = (_r_1 + n);
    }
    int _r_2 = r;
    r = (_r_2 % n);
    return r;
  }
  
  public static void main(String[] args) {
  }
}
