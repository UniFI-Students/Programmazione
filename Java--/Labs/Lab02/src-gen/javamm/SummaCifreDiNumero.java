package javamm;

import javamm.util.Input;

@SuppressWarnings("all")
public class SummaCifreDiNumero {
  public static void main(String[] args) {
    int n = Input.getInt("Input number: ");
    int sum = 0;
    while ((n > 0)) {
      {
        int _sum = sum;
        sum = (_sum + (n % 10));
        int _n = n;
        n = (_n / 10);
      }
    }
    System.out.println(("Answer: " + Integer.valueOf(sum)));
  }
}
