package javamm;

@SuppressWarnings("all")
public class Frequences {
  /**
   * Scrivere un metodo, detto frequences, che, dato
   * in input un array a di numeri interi non vuoto,
   * restituisca l'array delle frequenze degli
   * elementi distinti di a, in ordine crescente
   * dei valori degli elementi. Ad esempio, con
   * input il vettore {1,6,5,8,6,6,8,5,3,1,6,8},
   * il metodo deve restituire l'array {2,1,2,4,3},
   * in quanto il valore 1 appare due volte, il 3
   * una volta, il 5 due volte, il 6 quattro volte
   * e l'8 tre volte. L'array in input non deve essere
   * modificato dall'esecuzione del metodo.
   * 
   * ESEMPI
   * Input: {1,6,5,8,6,6,8,5,3,1,6,8}
   * Output: {2,1,2,4,3}
   * 
   * Input: {6,6,6,6}
   * Output: {4}
   * 
   * Input: {3,5,6,2}
   * Output: {1,1,1,1}
   */
  public static int[] frequences(int[] a) {
    int _length = a.length;
    int _minus = (_length - 1);
    Frequences.sort(a, 0, _minus);
    return Frequences.distinctsNumbersCount(a);
  }
  
  public static int[] distinctsNumbersCount(int[] a) {
    int n = a.length;
    int count = 0;
    boolean[] used = new boolean[n];
    for (int i = 0; (i < n); ++i) {
      boolean _not = (!used[i]);
      if (_not) {
        ++count;
        for (int j = i; (j < n); ++j) {
          boolean _tripleEquals = (a[i] == a[j]);
          if (_tripleEquals) {
            used[j] = true;
          }
        }
      }
    }
    int[] res = new int[count];
    int currI = 0;
    for (int i = 0; (i < n); ++i) {
      if (used[i]) {
        for (int j = i; (j < n); ++j) {
          boolean _tripleEquals = (a[i] == a[j]);
          if (_tripleEquals) {
            res[currI]++;
            used[j] = false;
          }
        }
        currI++;
      }
    }
    return res;
  }
  
  public static void sort(int[] a, int l, int h) {
    if ((l < h)) {
      int pi = Frequences.partition(a, l, h);
      Frequences.sort(a, l, (pi - 1));
      Frequences.sort(a, (pi + 1), h);
    }
  }
  
  public static int partition(int[] a, int l, int h) {
    int p = a[h];
    int i = (l - 1);
    for (int j = l; (j < h); ++j) {
      boolean _lessEqualsThan = (a[j] <= p);
      if (_lessEqualsThan) {
        ++i;
        int tmp = a[i];
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
