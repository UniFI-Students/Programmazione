package javamm;

@SuppressWarnings("all")
public class SpiralPath {
  /**
   * Dato un numero dispari positivo n, la matrice associata ad n e' la
   * matrice bidimensionale di dimensione nxn, riempita con i numeri da
   * 1 a nxn a partire dall'elemento in alto a sinistra e procedendo da
   * sinistra verso destra e dall'alto verso il basso. Ad esempio,
   * la matrice associata a 3 e' la seguente matrice:
   * 
   *   1 2 3
   *   4 5 6
   *   7 8 9
   * 
   * mentre la matrice associata a 5 e' la seguente matrice:
   * 
   *   1  2  3  4  5
   *   6  7  8  9 10
   *  11 12 13 14 15
   *  16 17 18 19 20
   *  21 22 23 24 25
   * 
   * La visita a spirale della matrice associata a n consiste nel visitare,
   * una e una sola volta, tutti gli elementi della matrice partendo
   * dall'elemento "al centro" e proseguendo secondo una spirale in senso
   * antiorario, ossia avanzando nel seguente ordine: in alto, a sinistra,
   * in basso e a destra, il numero di volte necessario per ciascuna direzione,
   * e ricominciando. Ad esempio, la visita a spirale della matrice associata a 3
   * visita i suoi elementi secondo il seguente ordine:
   * 
   * 5 2 1 4 7 8 9 6 3
   * 
   * mentre la visita a spirale della matrice associata a 5 visita i suoi elementi
   * secondo il seguente ordine:
   * 
   * 13 8 7 12 17 18 19 14 9 4 3 2 1 6 11 16 21 22 23 24 25 20 15 10 5
   * 
   * Scrivere un metodo, chiamato spiralPath, che dato in input un numero
   * dispari positivo e dato un numero positivo i tale che 1<=i<=nxn,
   * restituisca l'elemento della matrice associata ad n che viene
   * visitato per i-esimo durante la visita a spirale della matrice stessa.
   * 
   * ESEMPI
   * Input: 3, 2
   * Output: 2
   * 
   * Input: 3, 5
   * Output: 7
   * 
   * Input: 3, 8
   * Output: 6
   * 
   * Input: 5, 2
   * Output: 8
   * 
   * Input: 5, 8
   * Output: 14
   * 
   * Input: 5, 15
   * Output: 11
   */
  public static int spiralPath(int n, int i) {
    int[][] a = SpiralPath.CreateArrayWithIndexingValues(n, n);
    int currDirection = 0;
    int currISpir = 1;
    int currNumbersPerDirection = 0;
    int currVal = a[(n / 2)][(n / 2)];
    int[] currPos = new int[] { (n / 2), (n / 2) };
    while ((currISpir < i)) {
      {
        if (((currDirection % 2) == 0)) {
          ++currNumbersPerDirection;
        }
        for (int j = 0; ((j < currNumbersPerDirection) && (currISpir < i)); ++j) {
          {
            int[] nextPos = SpiralPath.MoveByDirection(currPos, currDirection, n, n);
            boolean _ArePositionsEqual = SpiralPath.ArePositionsEqual(currPos, nextPos);
            boolean _not = (!_ArePositionsEqual);
            if (_not) {
              ++currISpir;
              currVal = a[nextPos[0]][nextPos[1]];
            }
            currPos = nextPos;
          }
        }
        ++currDirection;
        int _currDirection = currDirection;
        currDirection = (_currDirection % 4);
      }
    }
    return currVal;
  }
  
  public static int[] MoveByDirection(int[] pos, int direction, int n, int m) {
    int[] res = new int[] { pos[0], pos[1] };
    switch (direction) {
      case 0:
        int _minus = (res[0] - 1);
        res[0] = Math.max(0, _minus);
        break;
      case 1:
        int _minus_1 = (res[1] - 1);
        res[1] = Math.max(0, _minus_1);
        break;
      case 2:
        int _plus = (res[0] + 1);
        res[0] = Math.min((n - 1), _plus);
        break;
      case 3:
        int _plus_1 = (res[1] + 1);
        res[1] = Math.min((m - 1), _plus_1);
        break;
    }
    return res;
  }
  
  public static boolean ArePositionsEqual(int[] pos1, int[] pos2) {
    return ((pos1 == pos2) || 
      ((pos1[0] == pos2[0]) && 
        (pos1[1] == pos2[1])));
  }
  
  public static int[][] CreateArrayWithIndexingValues(int n, int m) {
    int[][] res = new int[n][m];
    int currIndex = 0;
    for (int i = 0; (i < n); ++i) {
      for (int j = 0; (j < m); ++j) {
        int _plusPlus = ++currIndex;
        res[i][j] = _plusPlus;
      }
    }
    return res;
  }
  
  public static void main(String[] args) {
  }
}
