package javamm;

@SuppressWarnings("all")
public class TicTacToe {
  public static boolean tictactoe(int[][] a) {
    int n = a.length;
    for (int i = 0; (i < n); ++i) {
      {
        boolean isGoodIString = TicTacToe.IsPlayer(a[i][0]);
        for (int j = 1; ((j < n) && isGoodIString); ++j) {
          boolean _IsEqualTicTacToe = TicTacToe.IsEqualTicTacToe(a[i][j], a[i][(j - 1)]);
          boolean _not = (!_IsEqualTicTacToe);
          if (_not) {
            isGoodIString = false;
          }
        }
        if (isGoodIString) {
          return true;
        }
        boolean isGoodIColumn = TicTacToe.IsPlayer(a[0][i]);
        for (int j = 1; ((j < n) && isGoodIColumn); ++j) {
          boolean _IsEqualTicTacToe = TicTacToe.IsEqualTicTacToe(a[j][i], a[(j - 1)][i]);
          boolean _not = (!_IsEqualTicTacToe);
          if (_not) {
            isGoodIColumn = false;
          }
        }
        if (isGoodIColumn) {
          return true;
        }
      }
    }
    boolean isGoodDiag = TicTacToe.IsPlayer(a[0][0]);
    for (int i = 1; ((i < n) && isGoodDiag); ++i) {
      boolean _IsEqualTicTacToe = TicTacToe.IsEqualTicTacToe(a[i][i], a[(i - 1)][(i - 1)]);
      boolean _not = (!_IsEqualTicTacToe);
      if (_not) {
        isGoodDiag = false;
      }
    }
    if (isGoodDiag) {
      return true;
    }
    boolean isGoodReverseDiag = TicTacToe.IsPlayer(a[(n - 1)][0]);
    for (int i = 1; ((i < n) && isGoodReverseDiag); ++i) {
      boolean _IsEqualTicTacToe = TicTacToe.IsEqualTicTacToe(a[((n - i) - 1)][i], a[(n - i)][(i - 1)]);
      boolean _not = (!_IsEqualTicTacToe);
      if (_not) {
        isGoodReverseDiag = false;
      }
    }
    if (isGoodReverseDiag) {
      return true;
    }
    return false;
  }
  
  public static boolean IsEqualTicTacToe(int a, int b) {
    return ((a == b) && TicTacToe.IsPlayer(a));
  }
  
  public static boolean IsPlayer(int a) {
    return ((a == 1) || (a == 2));
  }
  
  public static void main(String[] args) {
  }
}
