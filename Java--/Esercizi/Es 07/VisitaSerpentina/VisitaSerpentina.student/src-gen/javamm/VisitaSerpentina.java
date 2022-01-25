package javamm;

@SuppressWarnings("all")
public class VisitaSerpentina {
  public static int[] visitaSerpentina(int[][] a, int row, int column) {
    int n = a.length;
    int m = a[0].length;
    int[] res = new int[(n * m)];
    int currResIndex = 0;
    boolean goToLeft = false;
    while ((currResIndex < (n * m))) {
      {
        if (goToLeft) {
          while (((currResIndex < (n * m)) && (column >= 0))) {
            res[currResIndex++] = a[row][column--];
          }
          column = 0;
        } else {
          while (((currResIndex < (n * m)) && (column < m))) {
            res[currResIndex++] = a[row][column++];
          }
          column = (m - 1);
        }
        boolean _not = (!goToLeft);
        goToLeft = _not;
        row = ((row + 1) % n);
      }
    }
    return res;
  }
  
  public static void main(String[] args) {
  }
}
