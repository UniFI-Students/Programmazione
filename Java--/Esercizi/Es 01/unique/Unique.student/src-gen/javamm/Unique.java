package javamm;

@SuppressWarnings("all")
public class Unique {
  /**
   * Scrivere un metodo, chiamato unique,
   * che dato in input un array a di numeri
   * interi positivi (eventualmente vuoto),
   * restituisca l'array (eventualmente vuoto)
   * contenente gli elementi di a che appaiono
   * una sola volta in a stesso, nello stesso ordine
   * con cui essi appaiono in a.
   * 
   * ESEMPI
   * Input: {32,23,12,23,15,32}
   * Output: {12,15}
   * 
   * Input: {127,34,45,56,34,127,23,45,12,56,23}
   * Output: {12}
   * 
   * Input: {20,11,15,41,23}
   * Output: {20,11,15,41,23}
   * 
   * Input: {127,34,45,56,34,127,23,45,12,56,23,12}
   * Output: {}
   * 
   * Input: {}
   * Output: {}
   */
  public static int[] unique(int[] a) {
    int n = a.length;
    int[] res = new int[Unique.getUniqCount(a)];
    int currI = 0;
    for (int i = 0; (i < n); ++i) {
      {
        boolean isUniq = true;
        for (int j = 0; ((j < n) && isUniq); ++j) {
          if (((i != j) && (a[i] == a[j]))) {
            isUniq = false;
          }
        }
        if (isUniq) {
          res[currI++] = a[i];
        }
      }
    }
    return res;
  }
  
  public static int getUniqCount(int[] a) {
    int n = a.length;
    int res = 0;
    for (int i = 0; (i < n); ++i) {
      {
        boolean isUniq = true;
        for (int j = 0; ((j < n) && isUniq); ++j) {
          if (((i != j) && (a[i] == a[j]))) {
            isUniq = false;
          }
        }
        if (isUniq) {
          ++res;
        }
      }
    }
    return res;
  }
  
  public static void main(String[] args) {
  }
}
