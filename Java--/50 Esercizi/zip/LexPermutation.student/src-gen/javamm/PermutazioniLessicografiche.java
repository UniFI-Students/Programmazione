package javamm;

@SuppressWarnings("all")
public class PermutazioniLessicografiche {
  /**
   * Dato un insieme di n caratteri, consideriamo il problema di generare
   * tutte le permutazioni di quest'insieme in ordine lessicografico.
   * Ad esempio, se l'insieme e' {m,b,t}, allora le permutazioni devono
   * essere generate nell'ordine seguente: [b, m, t], [b, t, m], [m, b, t],
   * [m, t, b], [t, b, m], [t, m, b]. Se invece l'insieme e' {a,x,o,f},
   * allora le permutazioni devono essere generate nell'ordine seguente:
   * [a, f, o, x],[a, f, x, o],[a, o, f, x],[a, o, x, f],[a, x, f, o],
   * [a, x, o, f],[f, a, o, x],[f, a, x, o],[f, o, a, x],[f, o, x, a],
   * [f, x, a, o],[f, x, o, a],[o, a, f, x],[o, a, x, f],[o, f, a, x],
   * [o, f, x, a],[o, x, a, f],[o, x, f, a],[x, a, f, o],[x, a, o, f],
   * [x, f, a, o],[x, f, o, a],[x, o, a, f],[x, o, f, a].
   * 
   * La generazione di tali permutazioni può essere eseguita nel modo seguente.
   * 
   * 1. Generare la permutazione dei caratteri ordinati in modo crescente.
   * 2. A partire dalla permutazione corrente generare la prossima nel modo seguente.
   *    2.1 Determinare il carattere c1 piu'  destra seguito da un carattere piu' grande.
   *    2.2 Determinare il minimo carattere c2 alla destra di c1 e piu' grande di c1.
   *    2.3 Scambiare c1 e c2.
   *    2.4 Ordinare la sottosequeza alla destra della posizione originale di c1.
   * 3. Ripetere il passo 2 per n!-1 volte.
   * 
   * Ad esempio, se la permutazione corrente è [o, a, x, f], allora il passo 2 esegue
   * le seguenti operazioni: determina che c1 e' a e che c2 e' f, scambia a con f e
   * ordina la sottosequenza [x,a], ottenendo quindi [o,f,a,x].
   * 
   * Scrivere un metodo, chiamato lex, cha dato un array di n caratteri distinti e
   * dato un intero positivo p<=n!, restituisca un array rappresentante la permutazione
   * in posizione p nella generazione lessicografica. Ad esempio, se a={'m','b','t'}
   * e p = 4, allora il metodo deve restituire l'array {'m','t','b'}, mentre se
   * a = {'a','x','o','f'} e p = 12, allora il metodo deve restituire l'array
   * {'f', 'x', 'o', 'a'}.
   */
  public static char[] lex(char[] a, int p) {
    char[] rst = PermutazioniLessicografiche.copiaVettore(a);
    int _length = rst.length;
    int _minus = (_length - 1);
    PermutazioniLessicografiche.ordinaCrescente(rst, 0, _minus);
    int c1 = 0;
    for (int i = 2; (i <= p); i++) {
      {
        int _cercaC1 = PermutazioniLessicografiche.cercaC1(rst);
        c1 = _cercaC1;
        int _cercaC2 = PermutazioniLessicografiche.cercaC2(rst, c1);
        PermutazioniLessicografiche.swap(rst, c1, _cercaC2);
        int _length_1 = rst.length;
        int _minus_1 = (_length_1 - 1);
        PermutazioniLessicografiche.ordinaCrescente(rst, (c1 + 1), _minus_1);
      }
    }
    return rst;
  }
  
  public static void ordinaCrescente(char[] a, int inizio, int fine) {
    for (int i = fine; (i >= inizio); i--) {
      for (int j = inizio; (j < i); j++) {
        boolean _greaterThan = (a[j] > a[(j + 1)]);
        if (_greaterThan) {
          PermutazioniLessicografiche.swap(a, j, (j + 1));
        }
      }
    }
  }
  
  public static char[] copiaVettore(char[] a) {
    char[] rst = new char[a.length];
    for (int i = 0; (i < a.length); i++) {
      rst[i] = a[i];
    }
    return rst;
  }
  
  public static void swap(char[] a, int i, int j) {
    char tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
  }
  
  public static int cercaC1(char[] a) {
    int rst = 0;
    for (int i = 0; (i < (a.length - 1)); i++) {
      boolean _lessThan = (a[i] < a[(i + 1)]);
      if (_lessThan) {
        rst = i;
      }
    }
    return rst;
  }
  
  public static int cercaC2(char[] a, int c1) {
    int rst = 0;
    char z = '{';
    for (int i = (c1 + 1); (i < a.length); i++) {
      if (((a[i] > a[c1]) && (a[i] < z))) {
        rst = i;
        z = a[rst];
      }
    }
    return rst;
  }
  
  public static void main(String[] args) {
  }
}
