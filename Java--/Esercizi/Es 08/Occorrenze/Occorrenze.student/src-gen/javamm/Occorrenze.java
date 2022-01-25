package javamm;

@SuppressWarnings("all")
public class Occorrenze {
  public static int[] occorrenzeCompresso(int[] a) {
    int n = a.length;
    int[] res = new int[(Occorrenze.Max(a) + 1)];
    for (int i = 0; (i < n); ++i) {
      ++res[a[i]];
    }
    return Occorrenze.ExcludeZerosFromArray(res);
  }
  
  public static int Max(int[] a) {
    int res = -1;
    int n = a.length;
    for (int i = 0; (i < n); ++i) {
      boolean _greaterThan = (a[i] > res);
      if (_greaterThan) {
        res = a[i];
      }
    }
    return res;
  }
  
  public static int[] ExcludeZerosFromArray(int[] a) {
    int n = a.length;
    int newN = 0;
    for (int i = 0; (i < n); ++i) {
      boolean _tripleNotEquals = (a[i] != 0);
      if (_tripleNotEquals) {
        ++newN;
      }
    }
    int[] res = new int[newN];
    int currIInRes = 0;
    for (int i = 0; (i < n); ++i) {
      boolean _tripleNotEquals = (a[i] != 0);
      if (_tripleNotEquals) {
        res[currIInRes++] = a[i];
      }
    }
    return res;
  }
  
  public static void main(String[] args) {
  }
}
