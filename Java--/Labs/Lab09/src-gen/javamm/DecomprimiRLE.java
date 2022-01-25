package javamm;

@SuppressWarnings("all")
public class DecomprimiRLE {
  /**
   * Una stringa binaria x compressa in formato RLE e' costituita da una sequenza
   * di cifre 0 e 1, ciascuna seguita da un numero intero che ne indica il numero
   * di ripetizioni. La stringa binaria decompressa corrispondente a x e' ottenuta
   * sostituendo ciascuna cifra binaria b seguita da un intero k da una sequenza
   * di k copie di b. Ad esempio, la stringa binaria corrispondente a 0312051301
   * e' la stringa binaria 00011000001110. Scrivere un metodo, chiamato decompressa,
   * che, dato in in input un array di interi non negativi rappresentante una
   * stringa binaria x compressa in formato RLE, restituisca un array di interi
   * non negativi rappresentante la stringa binaria decompressa corrispondente a x.
   * Ad esempio, con input l'array {0,3,1,2,0,5,1,3,0,1}, il metodo deve restituire
   * l'array {0,0,0,1,1,0,0,0,0,0,1,1,1,0}.
   */
  public static int[] decomprimiRLE(int[] x) {
    int oldSize = x.length;
    int newSize = 0;
    for (int i = 1; (i < oldSize); i = (i + 2)) {
      int _newSize = newSize;
      newSize = (_newSize + x[i]);
    }
    int[] result = new int[newSize];
    int currentIndex = 0;
    for (int i = 0; (i < oldSize); i = (i + 2)) {
      for (int j = 0; (j < x[(i + 1)]); ++j) {
        result[currentIndex++] = x[i];
      }
    }
    return result;
  }
  
  public static void main(String[] args) {
  }
}
