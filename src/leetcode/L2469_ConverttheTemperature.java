package leetcode;

public class L2469_ConverttheTemperature {
    public double[] convertTemperature(double celsius) {
        double Kelvin = celsius + 273.15;
        double Fahrenheit = celsius * 1.80 + 32.00;
        return new double[]{Kelvin, Fahrenheit};
    }
}
