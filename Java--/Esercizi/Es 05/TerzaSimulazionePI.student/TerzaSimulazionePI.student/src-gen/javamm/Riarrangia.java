package javamm;

@SuppressWarnings("all")
public class Riarrangia {
  public static int[] riarrangia(int[] a) {
    int[] res = new int[a.length];
    int currentResPos = 0;
    int negativeIndex = 0;
    int positiveIndex = 0;
    while ((currentResPos < a.length)) {
      {
        negativeIndex = Riarrangia.FindFirstNegativeIndex(a, negativeIndex);
        positiveIndex = Riarrangia.FindFirstPositiveIndex(a, positiveIndex);
        if (((currentResPos & 1) == 0)) {
          int _length = a.length;
          boolean _tripleNotEquals = (negativeIndex != _length);
          if (_tripleNotEquals) {
            res[currentResPos] = a[negativeIndex++];
          } else {
            res[currentResPos] = a[positiveIndex++];
          }
        } else {
          int _length_1 = a.length;
          boolean _tripleNotEquals_1 = (positiveIndex != _length_1);
          if (_tripleNotEquals_1) {
            res[currentResPos] = a[positiveIndex++];
          } else {
            res[currentResPos] = a[negativeIndex++];
          }
        }
        ++currentResPos;
      }
    }
    return res;
  }
  
  public static int FindFirstNegativeIndex(int[] a, int startPos) {
    while (((startPos < a.length) && (a[startPos] >= 0))) {
      ++startPos;
    }
    return startPos;
  }
  
  public static int FindFirstPositiveIndex(int[] a, int startPos) {
    while (((startPos < a.length) && (a[startPos] < 0))) {
      ++startPos;
    }
    return startPos;
  }
  
  public static void main(String[] args) {
  }
}
