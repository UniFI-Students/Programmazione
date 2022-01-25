package javamm;

@SuppressWarnings("all")
public class TestBilanciamento {
  public static boolean testBilanciamento(int[] mioArray) {
    if (((!TestBilanciamento.IsEven(mioArray.length)) || (mioArray.length == 0))) {
      return false;
    }
    int _length = mioArray.length;
    boolean _tripleEquals = (_length == 2);
    if (_tripleEquals) {
      return (mioArray[0] == mioArray[1]);
    }
    return TestBilanciamento.testBilanciamentoRecursive(mioArray, 1, TestBilanciamento.CalculateBalanceSum(mioArray, 0));
  }
  
  public static boolean IsEven(int n) {
    return ((n & 1) == 0);
  }
  
  public static int CalculateBalanceSum(int[] arr, int i) {
    return (arr[i] + arr[((arr.length - i) - 1)]);
  }
  
  public static boolean testBilanciamentoIterative(int[] mioArray) {
    int balanceSum0 = TestBilanciamento.CalculateBalanceSum(mioArray, 0);
    for (int i = 1; (i < (mioArray.length >> 1)); ++i) {
      int _CalculateBalanceSum = TestBilanciamento.CalculateBalanceSum(mioArray, i);
      boolean _tripleNotEquals = (_CalculateBalanceSum != balanceSum0);
      if (_tripleNotEquals) {
        return false;
      }
    }
    return true;
  }
  
  public static boolean testBilanciamentoRecursive(int[] mioArray, int currIndex, int currBalanceSum) {
    int newBalanceSum = TestBilanciamento.CalculateBalanceSum(mioArray, currIndex);
    int _length = mioArray.length;
    int _doubleGreaterThan = (_length >> 1);
    boolean _tripleEquals = (currIndex == _doubleGreaterThan);
    if (_tripleEquals) {
      return true;
    }
    if ((newBalanceSum != currBalanceSum)) {
      return false;
    } else {
      return TestBilanciamento.testBilanciamentoRecursive(mioArray, (currIndex + 1), currBalanceSum);
    }
  }
  
  public static void main(String[] args) {
  }
}
