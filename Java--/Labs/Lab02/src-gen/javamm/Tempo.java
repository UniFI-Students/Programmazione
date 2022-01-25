package javamm;

import javamm.util.Input;

@SuppressWarnings("all")
public class Tempo {
  public static void main(String[] args) {
    double minutesInDay = (60 * 24);
    double minutesInYear = (minutesInDay * 365);
    int currentMinutes = Input.getInt("Input minutes: ");
    double years = (currentMinutes / minutesInYear);
    double days = (currentMinutes / minutesInDay);
    String _plus = (Integer.valueOf(currentMinutes) + " minutes = ");
    String _plus_1 = (_plus + Double.valueOf(years));
    String _plus_2 = (_plus_1 + " Years = ");
    String _plus_3 = (_plus_2 + Double.valueOf(days));
    String _plus_4 = (_plus_3 + " days");
    System.out.println(_plus_4);
  }
}
