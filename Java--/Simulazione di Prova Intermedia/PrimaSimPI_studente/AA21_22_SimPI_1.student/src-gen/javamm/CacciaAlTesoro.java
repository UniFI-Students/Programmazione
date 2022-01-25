package javamm;

@SuppressWarnings("all")
public class CacciaAlTesoro {
  public static boolean cacciaAlTesoro(char[][] M) {
    int n = M.length;
    int m = M[0].length;
    char[][] a = new char[M.length][M[0].length];
    for (int i = 0; (i < n); ++i) {
      for (int j = 0; (j < m); ++j) {
        a[i][j] = M[i][j];
      }
    }
    return CacciaAlTesoro.cacciaAlTesoroRecursivo(a, 0, 0);
  }
  
  public static boolean cacciaAlTesoroRecursivo(char[][] map, int currX, int currY) {
    boolean res = false;
    int n = map.length;
    int m = map[0].length;
    char currChar = map[currX][currY];
    map[currX][currY] = 'V';
    switch (currChar) {
      case 'A':
        boolean _res = res;
        boolean _cacciaAlTesoroRecursivo = CacciaAlTesoro.cacciaAlTesoroRecursivo(map, CacciaAlTesoro.DoCircularMove(currX, 0, (n - 1), -1), currY);
        res = (_res | _cacciaAlTesoroRecursivo);
        break;
      case 'B':
        boolean _res_1 = res;
        boolean _cacciaAlTesoroRecursivo_1 = CacciaAlTesoro.cacciaAlTesoroRecursivo(map, CacciaAlTesoro.DoCircularMove(currX, 0, (n - 1), 1), currY);
        res = (_res_1 | _cacciaAlTesoroRecursivo_1);
        break;
      case 'S':
        boolean _res_2 = res;
        boolean _cacciaAlTesoroRecursivo_2 = CacciaAlTesoro.cacciaAlTesoroRecursivo(map, currX, CacciaAlTesoro.DoCircularMove(currY, 0, (m - 1), -1));
        res = (_res_2 | _cacciaAlTesoroRecursivo_2);
        break;
      case 'D':
        boolean _res_3 = res;
        boolean _cacciaAlTesoroRecursivo_3 = CacciaAlTesoro.cacciaAlTesoroRecursivo(map, currX, CacciaAlTesoro.DoCircularMove(currY, 0, (m - 1), 1));
        res = (_res_3 | _cacciaAlTesoroRecursivo_3);
        break;
      case 'X':
        boolean _res_4 = res;
        res = (_res_4 | true);
        break;
      case 'T':
        boolean _res_5 = res;
        res = (_res_5 | false);
        break;
      case '?':
        boolean _res_6 = res;
        boolean _cacciaAlTesoroRecursivo_4 = CacciaAlTesoro.cacciaAlTesoroRecursivo(map, CacciaAlTesoro.DoCircularMove(currX, 0, (n - 1), -1), currY);
        res = (_res_6 | _cacciaAlTesoroRecursivo_4);
        boolean _res_7 = res;
        boolean _cacciaAlTesoroRecursivo_5 = CacciaAlTesoro.cacciaAlTesoroRecursivo(map, CacciaAlTesoro.DoCircularMove(currX, 0, (n - 1), 1), currY);
        res = (_res_7 | _cacciaAlTesoroRecursivo_5);
        boolean _res_8 = res;
        boolean _cacciaAlTesoroRecursivo_6 = CacciaAlTesoro.cacciaAlTesoroRecursivo(map, currX, CacciaAlTesoro.DoCircularMove(currY, 0, (m - 1), -1));
        res = (_res_8 | _cacciaAlTesoroRecursivo_6);
        boolean _res_9 = res;
        boolean _cacciaAlTesoroRecursivo_7 = CacciaAlTesoro.cacciaAlTesoroRecursivo(map, currX, CacciaAlTesoro.DoCircularMove(currY, 0, (m - 1), 1));
        res = (_res_9 | _cacciaAlTesoroRecursivo_7);
        break;
    }
    return res;
  }
  
  public static int DoCircularMove(int x, int left, int right, int moveBy) {
    x = (x + (moveBy % (right + 1)));
    if ((x < left)) {
      int _x = x;
      x = (_x + (right + 1));
    }
    int _x_1 = x;
    x = (_x_1 % (right + 1));
    return x;
  }
  
  public static void main(String[] args) {
  }
}
