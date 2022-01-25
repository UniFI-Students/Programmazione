package javamm;

@SuppressWarnings("all")
public class SlotMachine {
  public static int[][] ruota(int[][] S, int[] r) {
    int n = S.length;
    int m = S[0].length;
    for (int j = 0; (j < m); ++j) {
      int _modulo = (r[j] % n);
      SlotMachine.RotateColumnInMatrixDownwards(S, j, _modulo);
    }
    return S;
  }
  
  public static boolean controllaVincita(int[][] S) {
    int n = S.length;
    int m = S[0].length;
    for (int j = 0; (j < m); ++j) {
      boolean _tripleNotEquals = (S[(n / 2)][j] != 1);
      if (_tripleNotEquals) {
        return false;
      }
    }
    return true;
  }
  
  public static boolean partitaCompleta(int[][] S, int[] r, int k) {
    return SlotMachine.partitaCompletaRicursiva(S, r, k);
  }
  
  public static void RotateColumnInMatrixDownwards(int[][] a, int column, int rotates) {
    int n = a.length;
    for (int r = 0; (r < rotates); ++r) {
      {
        int t = a[0][column];
        for (int currI = 0; (currI < n); ++currI) {
          {
            int nextI = SlotMachine.DoCircularMove(currI, 0, (n - 1), 1);
            int nextT = a[nextI][column];
            a[nextI][column] = t;
            t = nextT;
          }
        }
      }
    }
  }
  
  public static int DoCircularMove(int x, int left, int right, int moveBy) {
    x = (x + (moveBy % (right + 1)));
    if ((x < left)) {
      int _x = x;
      x = (_x + (right + 1));
    }
    int _x_1 = x;
    x = (_x_1 % (right + 1));
    return x;
  }
  
  public static boolean partitaCompletaRicursiva(int[][] S, int[] r, int k) {
    int n = S.length;
    int m = S[0].length;
    if ((k == 0)) {
      return SlotMachine.controllaVincita(S);
    };
    int[][] newS = new int[n][m];
    for (int i = 0; (i < n); ++i) {
      for (int j = 0; (j < m); ++j) {
        newS[i][j] = S[i][j];
      }
    }
    SlotMachine.ruota(newS, r);
    return (SlotMachine.controllaVincita(S) || SlotMachine.partitaCompletaRicursiva(newS, r, (k - 1)));
  }
  
  public static void main(String[] args) {
  }
}
