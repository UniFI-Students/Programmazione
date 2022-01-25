package javamm;

@SuppressWarnings("all")
public class EsplosioneMatrice {
  public static int[][] esplodiMatrice(int[][] T, int r, int c) {
    while ((T[r][c] == 1)) {
      {
        T[r][c] = 0;
        int[] nextExplCell = EsplosioneMatrice.GetNextExplosionCell(T, r, c);
        if ((nextExplCell == null)) {
          break;
        }
        r = nextExplCell[0];
        c = nextExplCell[1];
      }
    }
    return T;
  }
  
  public static int IndexAround(int index, int minIndex, int maxIndex, int addI) {
    int _index = index;
    index = (_index + addI);
    if (((index < minIndex) || (maxIndex < index))) {
      return -1;
    } else {
      return index;
    }
  }
  
  public static int[] GetNextExplosionCell(int[][] T, int r, int c) {
    int[][] aroundCellIndexes = EsplosioneMatrice.GetAroundCellIndexes(r, c, T.length, T[0].length);
    int explCellI = -1;
    int explCellJ = -1;
    for (int i = 0; (i < aroundCellIndexes.length); ++i) {
      {
        int currI = aroundCellIndexes[i][0];
        int currJ = aroundCellIndexes[i][1];
        boolean _tripleEquals = (T[currI][currJ] == 1);
        if (_tripleEquals) {
          explCellI = currI;
          explCellJ = currJ;
        }
      }
    }
    if (((explCellI == -1) && (explCellJ == -1))) {
      return null;
    } else {
      return new int[] { explCellI, explCellJ };
    }
  }
  
  public static int[][] GetAroundCellIndexes(int r, int c, int n, int m) {
    int aroundCellsCount = 0;
    for (int addI = -1; (addI <= 1); ++addI) {
      for (int addJ = -1; (addJ <= 1); ++addJ) {
        if (((EsplosioneMatrice.IndexAround(r, 0, (n - 1), addI) != -1) && 
          (EsplosioneMatrice.IndexAround(c, 0, (m - 1), addJ) != -1))) {
          ++aroundCellsCount;
        }
      }
    }
    if ((aroundCellsCount == 0)) {
      return null;
    }
    int[][] aroundCells = new int[aroundCellsCount][2];
    int currentCellI = 0;
    for (int addI = -1; (addI <= 1); ++addI) {
      for (int addJ = -1; (addJ <= 1); ++addJ) {
        if (((EsplosioneMatrice.IndexAround(r, 0, (n - 1), addI) != -1) && 
          (EsplosioneMatrice.IndexAround(c, 0, (m - 1), addJ) != -1))) {
          aroundCells[currentCellI][0] = EsplosioneMatrice.IndexAround(r, 0, (n - 1), addI);
          aroundCells[currentCellI][1] = EsplosioneMatrice.IndexAround(c, 0, (m - 1), addJ);
          ++currentCellI;
        }
      }
    }
    return aroundCells;
  }
  
  public static void main(String[] args) {
  }
}
