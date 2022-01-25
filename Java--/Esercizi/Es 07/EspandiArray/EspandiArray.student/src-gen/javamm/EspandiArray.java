package javamm;

@SuppressWarnings("all")
public class EspandiArray {
  public static int[][] espandiArray(int[] v) {
    int n = v[EspandiArray.FindMaxIndex(v)];
    int m = v.length;
    int[][] res = new int[n][m];
    for (int i = 0; (i < n); ++i) {
      for (int j = 0; (j < m); ++j) {
        boolean _lessThan = (i < v[j]);
        if (_lessThan) {
          res[i][j] = v[j];
        }
      }
    }
    return res;
  }
  
  public static int FindMaxIndex(int[] a) {
    int max = 0;
    int maxIndex = 0;
    int n = a.length;
    for (int i = 0; (i < n); ++i) {
      boolean _lessThan = (max < a[i]);
      if (_lessThan) {
        max = a[i];
        maxIndex = i;
      }
    }
    return maxIndex;
  }
  
  public static void main(String[] args) {
  }
}
