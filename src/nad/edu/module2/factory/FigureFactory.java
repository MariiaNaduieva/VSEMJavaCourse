package nad.edu.module2.factory;

import nad.edu.module2.polymorphism.Cube2;
import nad.edu.module2.polymorphism.interfaces.IGeometry;

/**
 * @author Mariia Naduieva
 * @version 1.0.0
 * @project VSEM
 * @class FigureFactory
 * @since 26.03.2021 - 16.47
 **/

public class FigureFactory {
    public static IGeometry create(double a, double b) {
        if (a == b) {
            return new Quadrat((int) a);
        }
        return new Rectangle2((int) a, (int) b);
    }

    public static IGeometry create(double a, double b, Figures figure) {
        if (figure.equals(Figures.QUADRAT)) return new Quadrat((int) a);
        if (figure.equals(Figures.CUBE)) return new Cube2(a);
        if (figure.equals(Figures.RECTANGLE)) return new Rectangle2((int) a, (int) b);
        return null;
    }
}
