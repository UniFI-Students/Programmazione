package javamm;

@SuppressWarnings("all")
public class CompattaMatrice {
  public static int[][] compattaMatrice(int[][] a) {
    int n = a.length;
    int m = a[0].length;
    int k = 0;
    for (int i = 0; (i < n); ++i) {
      for (int j = 0; (j < m); ++j) {
        boolean _tripleNotEquals = (a[i][j] != 0);
        if (_tripleNotEquals) {
          ++k;
        }
      }
    }
    if ((k == 0)) {
      return null;
    }
    int[][] res = new int[k][3];
    int currIndexRes = 0;
    for (int i = 0; (i < n); ++i) {
      for (int j = 0; (j < m); ++j) {
        boolean _tripleNotEquals = (a[i][j] != 0);
        if (_tripleNotEquals) {
          res[currIndexRes][0] = a[i][j];
          res[currIndexRes][1] = i;
          res[currIndexRes][2] = j;
          ++currIndexRes;
        }
      }
    }
    CompattaMatrice.Sort(res, 0, (k - 1));
    return res;
  }
  
  public static void Sort(int[][] a, int l, int r) {
    if ((l < r)) {
      int pi = CompattaMatrice.Partition(a, l, r);
      CompattaMatrice.Sort(a, l, (pi - 1));
      CompattaMatrice.Sort(a, (pi + 1), r);
    }
  }
  
  public static int Partition(int[][] a, int l, int h) {
    int[] p = a[h];
    int i = (l - 1);
    for (int j = l; (j < h); ++j) {
      boolean _lessEqualsThan = (a[j][0] <= p[0]);
      if (_lessEqualsThan) {
        ++i;
        int[] tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
      }
    }
    a[h] = a[(i + 1)];
    a[(i + 1)] = p;
    return (i + 1);
  }
  
  public static void main(String[] args) {
  }
}
