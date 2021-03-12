package nad.edu;

/**
 * @author Mariia Naduieva
 * @version 1.0.0
 * @project VSEM
 * @class Integral
 * @since 12.03.2021 - 17.53
 **/

public class Integral {
    public static double getIntegral(int secant) {
        double start = 0;
        double finish = Math.PI;
        int steps = 1000;
        double step = (finish - start) / steps;
        double area = 0;
        double height = 0;
        for (int i = 0; i < steps; i++) {
            if (Math.sin(i * step) < 0.1 * secant) {
                height = Math.sin(i * step);
            } else {
                height = 0.1 * secant;
            }
            double currentArea = height * step;
            area = area + currentArea;
        }
        return area;
    }

    public static void main(String[] args) {
        System.out.println("The area of the cut-off sinusoid: " + getIntegral(7));
    }
}
// The area of the cut-off sinusoid: 1.6852711508008378
