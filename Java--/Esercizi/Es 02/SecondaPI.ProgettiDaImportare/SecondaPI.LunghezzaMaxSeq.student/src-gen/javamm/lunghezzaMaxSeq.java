package javamm;

@SuppressWarnings("all")
public class lunghezzaMaxSeq {
  /**
   * Definire un metodo ricorsivo Java--, chiamato lunghezzaMaxSeq che,
   * dati in input un array a di caratteri (con almeno un elemento) ed
   * un carattere c, restituisca la lunghezza della più lunga sequenza
   * di caratteri c consecutivi in a.
   * Nota bene: una soluzione non ricorsiva è considerata errata, anche
   * se supera i JUnit test.
   */
  public static int lunghezzaMaxSeq(char[] a, char c) {
    int _length = a.length;
    int _minus = (_length - 1);
    return lunghezzaMaxSeq.lunghezzaMaxSeqRec(a, c, _minus, 0);
  }
  
  public static int lunghezzaMaxSeqRec(char[] a, char c, int lastAIndex, int prevLength) {
    if ((lastAIndex == 0)) {
      boolean _tripleEquals = (a[0] == c);
      if (_tripleEquals) {
        return (prevLength + 1);
      } else {
        return prevLength;
      }
    }
    boolean _tripleEquals_1 = (a[lastAIndex] == c);
    if (_tripleEquals_1) {
      ++prevLength;
    } else {
      prevLength = 0;
    }
    return lunghezzaMaxSeq.Max(lunghezzaMaxSeq.lunghezzaMaxSeqRec(a, c, (lastAIndex - 1), prevLength), prevLength);
  }
  
  public static int Max(int a, int b) {
    int _xjconditionalexpression = (int) 0;
    if ((a > b)) {
      _xjconditionalexpression = a;
    } else {
      _xjconditionalexpression = b;
    }
    return _xjconditionalexpression;
  }
  
  public static void main(String[] args) {
  }
}
