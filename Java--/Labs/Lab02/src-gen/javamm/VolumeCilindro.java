package javamm;

import javamm.util.Input;

@SuppressWarnings("all")
public class VolumeCilindro {
  public static void main(String[] args) {
    double h = Input.getDouble("Height: ");
    double r = Input.getDouble("Radius: ");
    double volume = (((r * r) * h) * Math.PI);
    System.out.println(("Volume is " + Double.valueOf(volume)));
  }
}
