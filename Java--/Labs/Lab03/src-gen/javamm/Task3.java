package javamm;

import javamm.util.Input;

@SuppressWarnings("all")
public class Task3 {
  public static void main(String[] args) {
    long mmsInSec = 1;
    long mmsInMin = (mmsInSec * 60);
    long mmsInHour = (mmsInMin * 60);
    long mmsInDay = (mmsInHour * 24);
    long mmsInYear = (mmsInDay * 365);
    long mms = Input.getInt("Input milliseconds: ");
    long currSec = (mms / mmsInSec);
    long currMin = ((mms / mmsInMin) % mmsInMin);
    long currHour = ((mms / mmsInHour) % mmsInHour);
    long currDay = ((mms / mmsInDay) % mmsInDay);
    long currYear = (((mms / mmsInYear) % mmsInYear) + 1970);
    String _plus = (Long.valueOf(currHour) + ":");
    String _plus_1 = (_plus + Long.valueOf(currMin));
    String _plus_2 = (_plus_1 + ":");
    String _plus_3 = (_plus_2 + Long.valueOf(currSec));
    String _plus_4 = (_plus_3 + " ");
    String _plus_5 = (_plus_4 + Long.valueOf(currDay));
    String _plus_6 = (_plus_5 + "D ");
    String _plus_7 = (_plus_6 + Long.valueOf(currYear));
    String _plus_8 = (_plus_7 + "Y");
    System.out.println(_plus_8);
  }
}
