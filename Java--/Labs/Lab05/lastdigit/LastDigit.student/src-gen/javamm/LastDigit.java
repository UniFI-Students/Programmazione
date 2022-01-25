package javamm;

@SuppressWarnings("all")
public class LastDigit {
  public static boolean lastDigit(int a, int b, int c) {
    return ((((a % 10) == (b % 10)) || ((a % 10) == (c % 10))) || ((b % 10) == (c % 10)));
  }
  
  public static void main(String[] args) {
  }
}
