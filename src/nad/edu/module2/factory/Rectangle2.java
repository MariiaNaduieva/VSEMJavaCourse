package nad.edu.module2.factory;

import nad.edu.module2.polymorphism.interfaces.IGeometry;

import java.util.Objects;

/**
 * @author Mariia Naduieva
 * @version 1.0.0
 * @project VSEM
 * @class Rectangle
 * @since 21.03.2021 - 17.30
 **/

public class Rectangle2 implements IGeometry {
    private int length;
    private int width;

    public Rectangle2() {
    }

    public Rectangle2(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle2 rectangle = (Rectangle2) o;
        return getLength() == rectangle.getLength() && getWidth() == rectangle.getWidth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidth());
    }

    @Override
    public double getPerimeter() {
        return ((this.getLength() * 2) + (this.getWidth() * 2));
    }

    public double getArea() {
        return this.getLength() * this.getWidth();
    }
}
