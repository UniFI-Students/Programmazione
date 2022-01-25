package javamm;

@SuppressWarnings("all")
public class Distribuzione {
  /**
   * Un array di numeri interi positivi si dice
   * d-uniforme, per qualche d>0, se e' ordinato
   * in modo non crescente e se ogni valore appare
   * esattamente d volte. Ad esempio, l'array
   * {13,13,13,8,8,8,6,6,6}
   * e' 3-uniforme.
   * La distribuzione di un array d-uniforme
   * contenente n elementi, e' l'array
   * ottenuto ponendo le d copie di
   * ciascun valore in n/d gruppi ordinati in
   * modo decrescente, uno di seguito all'altro.
   * Ad esempio la distribuzione dell'array
   * {13,13,13,8,8,8,6,6,6}
   * e' l'array
   * {13,8,6,13,8,6,13,8,6}.
   * Scrivere un metodo, detto distribuisci, che,
   * dato in input un array a di numeri interi
   * positivi ordinato in modo non crescente,
   * restituisca la distribuzione di a, se a e'
   * d-uniforme per qualche d>0, altrimenti
   * restituisca l'array a stesso. Ad esempio, con
   * input l'array
   * {13,13,13,8,8,8,6,6,6}
   * il metodo deve restituire l'array
   * {13,8,6,13,8,6,13,8,6},
   * mentre con input l'array
   * {13,13,13,8,8,8,6,6}
   * il metodo deve restituire l'array
   * {13,13,13,8,8,8,6,6}.
   * Infine, con input l'array
   * {13,13,13}
   * il metodo deve restituire l'array
   * {13,13,13}.
   */
  public static int[] distribuisci(int[] a) {
    int n = a.length;
    int[] res = new int[n];
    for (int i = 0; (i < n); ++i) {
      res[i] = a[i];
    }
    int _d = Distribuzione.getD(a);
    boolean _tripleNotEquals = (_d != 0);
    if (_tripleNotEquals) {
      return Distribuzione.distribute(a);
    } else {
      return a;
    }
  }
  
  public static int getD(int[] a) {
    int n = a.length;
    int dimension = 0;
    boolean[] used = new boolean[n];
    for (int i = 0; (i < n); ++i) {
      boolean _not = (!used[i]);
      if (_not) {
        int currD = 0;
        for (int j = i; (j < n); ++j) {
          boolean _tripleEquals = (a[i] == a[j]);
          if (_tripleEquals) {
            used[j] = true;
            ++currD;
          }
        }
        if ((dimension == 0)) {
          dimension = currD;
        }
        if ((currD != dimension)) {
          return 0;
        }
      }
    }
    return dimension;
  }
  
  public static int[] distribute(int[] a) {
    int n = a.length;
    int d = Distribuzione.getD(a);
    int[] res = new int[n];
    int currI = 0;
    int lastI = 0;
    {
      int i = 0;
      boolean _while = (i < n);
      while (_while) {
        {
          while ((currI < n)) {
            {
              res[currI] = a[i];
              int _currI = currI;
              currI = (_currI + (n / d));
            }
          }
          int _plusPlus = ++lastI;
          currI = _plusPlus;
        }
        int _i = i;
        i = (_i + d);
        _while = (i < n);
      }
    }
    return res;
  }
  
  public static void main(String[] args) {
  }
}
