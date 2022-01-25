package javamm;

import javamm.util.Input;

@SuppressWarnings("all")
public class gaus {
  public static void main(String[] args) {
    int n = Input.getInt("Write number n to calculate elements sum from 1 to n included: ");
    long s = ((n * (n + 1)) / 2);
    System.out.println(s);
  }
}
