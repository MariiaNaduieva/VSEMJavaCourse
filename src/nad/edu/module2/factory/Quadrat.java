package nad.edu.module2.factory;

import nad.edu.module2.polymorphism.interfaces.IGeometry;

/**
 * @author Mariia Naduieva
 * @version 1.0.0
 * @project VSEM
 * @class Quadrat
 * @since 26.03.2021 - 17.00
 **/

public class Quadrat implements IGeometry {
    private int side;

    public Quadrat() {
    }

    public Quadrat(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Quadrat {" +
                "side = " + side +
                '}';
    }

    @Override
    public double getPerimeter() {
        return (this.getSide() * 4);
    }

    @Override
    public double getArea() {
        return (this.getSide() * this.getSide());
    }
}
