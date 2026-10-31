package tem;

public class Main {
   public static void main(String[] args) {

    double[] temperature = {-5, 25, 55}; // ต้องอยู่ตรงนี้

    Thermometer t = new Thermometer();

    for (int i = 0; i < temperature.length; i++) {
        try {
            t.checkTemperature(temperature[i]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
}