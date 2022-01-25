package javamm;

@SuppressWarnings("all")
public class SpiralMatrix {
  public static int[] GoToDirection(int direction, int[] currPos, int[] matrixLimits) {
    int[] res = new int[] { currPos[0], currPos[1] };
    switch (direction) {
      case 0:
        res[1] = matrixLimits[3];
        break;
      case 1:
        res[0] = matrixLimits[2];
        break;
      case 2:
        res[1] = matrixLimits[1];
        break;
      case 3:
        res[0] = matrixLimits[0];
        break;
    }
    return res;
  }
  
  public static void ResizeSpiralMatrixLimits(int direction, int[] matrixLimits) {
    switch (direction) {
      case 0:
        ++matrixLimits[0];
        break;
      case 1:
        --matrixLimits[3];
        break;
      case 2:
        --matrixLimits[2];
        break;
      case 3:
        ++matrixLimits[1];
        break;
    }
  }
  
  public static boolean ArePositionsEqual(int[] pos1, int[] pos2) {
    return ((pos1 == pos2) || 
      ((pos1[0] == pos2[0]) && 
        (pos1[1] == pos2[1])));
  }
  
  public static int ManhatanDistance(int[] pos1, int[] pos2) {
    int _minus = (pos2[1] - pos1[1]);
    int _abs = Math.abs(_minus);
    int _minus_1 = (pos2[0] - pos1[0]);
    int _abs_1 = Math.abs(_minus_1);
    return (_abs + _abs_1);
  }
  
  public static int[] CalculatePosWithShiftInDirection(int[] pos, int direction, int shift) {
    int[] res = new int[] { pos[0], pos[1] };
    if ((direction < 2)) {
      int _plus = (res[(1 - direction)] + shift);
      res[(1 - direction)] = _plus;
    } else {
      int _minus = (res[(3 - direction)] - shift);
      res[(3 - direction)] = _minus;
    }
    return res;
  }
  
  public static int[] spiralMatrix(int n, int x) {
    int currDirection = 0;
    int[] currPos = new int[] { 0, 0 };
    int[] matrixLimits = new int[] { 0, 0, (n - 1), (n - 1) };
    int currX = 1;
    boolean foundX = false;
    int[] nextPos = { (n - 1), (n - 1) };
    while (((!foundX) && (currX <= (n * n)))) {
      {
        nextPos = SpiralMatrix.GoToDirection(currDirection, currPos, matrixLimits);
        SpiralMatrix.ResizeSpiralMatrixLimits(currDirection, matrixLimits);
        int _ManhatanDistance = SpiralMatrix.ManhatanDistance(currPos, nextPos);
        int nextX = (currX + _ManhatanDistance);
        if (((currX <= x) && (x <= nextX))) {
          return SpiralMatrix.CalculatePosWithShiftInDirection(currPos, currDirection, (x - currX));
        }
        currDirection = ((currDirection + 1) % 4);
        boolean _foundX = foundX;
        boolean _ArePositionsEqual = SpiralMatrix.ArePositionsEqual(currPos, nextPos);
        foundX = (_foundX | _ArePositionsEqual);
        currPos = nextPos;
        currX = nextX;
      }
    }
    return null;
  }
  
  public static void main(String[] args) {
  }
}
