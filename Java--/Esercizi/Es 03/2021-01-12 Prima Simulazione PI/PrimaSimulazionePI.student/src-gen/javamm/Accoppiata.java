package javamm;

@SuppressWarnings("all")
public class Accoppiata {
  public static boolean accoppiata(char[] a) {
    int _length = a.length;
    int _bitwiseAnd = (_length & 1);
    boolean _tripleEquals = (_bitwiseAnd == 1);
    if (_tripleEquals) {
      return false;
    } else {
      return Accoppiata.PairArrayWithEvenLengthRecursive(a, 0);
    }
  }
  
  public static boolean PairArrayWithEvenLengthRecursive(char[] a, int currIndex) {
    int _length = a.length;
    int _doubleGreaterThan = (_length >> 1);
    int nextIndex = (_doubleGreaterThan + currIndex);
    int _length_1 = a.length;
    boolean _greaterEqualsThan = (nextIndex >= _length_1);
    if (_greaterEqualsThan) {
      return true;
    }
    boolean _tripleNotEquals = (a[currIndex] != a[nextIndex]);
    if (_tripleNotEquals) {
      return false;
    } else {
      return Accoppiata.PairArrayWithEvenLengthRecursive(a, (currIndex + 1));
    }
  }
  
  public static void main(String[] args) {
  }
}
