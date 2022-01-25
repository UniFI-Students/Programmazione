package javamm;

@SuppressWarnings("all")
public class HarmonicSum {
  public static int harmonicSum(int x) {
    int currI = 1;
    double currH = 0;
    double currX = 0;
    while ((currX < x)) {
      {
        double _currH = currH;
        currH = (_currH + (1.0 / currI));
        double _currX = currX;
        currX = (_currX + currH);
        ++currI;
      }
    }
    return (currI - 1);
  }
  
  public static void main(String[] args) {
  }
}
