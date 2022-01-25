package javamm;

@SuppressWarnings("all")
public class ContaSottomatrici {
  public static int contaSottomatrici(int[][] T, int[][] S) {
    int res = 0;
    int tN = T.length;
    int tM = T[0].length;
    int sN = S.length;
    int sM = S[0].length;
    for (int i = 0; (i < ((tN - sN) + 1)); ++i) {
      for (int j = 0; (j < ((tM - sM) + 1)); ++j) {
        {
          int[][] coppiedT = ContaSottomatrici.CreateNew2DArrayFrom(T, i, j, sN, sM);
          boolean _Are2DArrayEquals = ContaSottomatrici.Are2DArrayEquals(S, coppiedT);
          if (_Are2DArrayEquals) {
            ++res;
          }
        }
      }
    }
    return res;
  }
  
  public static int[][] CreateNew2DArrayFrom(int[][] T, int startI, int startJ, int newN, int newM) {
    int[][] res = new int[newN][newM];
    for (int i = 0; (i < newN); ++i) {
      for (int j = 0; (j < newM); ++j) {
        res[i][j] = T[(startI + i)][(startJ + j)];
      }
    }
    return res;
  }
  
  public static boolean Are2DArrayEquals(int[][] a, int[][] b) {
    if (((a.length != b.length) || (a[0].length != b[0].length))) {
      return false;
    }
    int n = a.length;
    int m = a[0].length;
    for (int i = 0; (i < n); ++i) {
      for (int j = 0; (j < m); ++j) {
        boolean _tripleNotEquals = (a[i][j] != b[i][j]);
        if (_tripleNotEquals) {
          return false;
        }
      }
    }
    return true;
  }
  
  public static void main(String[] args) {
  }
}
