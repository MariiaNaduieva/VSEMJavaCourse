package nad.edu.module2.polymorphism;

import nad.edu.module2.polymorphism.interfaces.IGeometry;
import nad.edu.module2.polymorphism.interfaces.IPacking;

import java.util.Objects;

/**
 * @author Mariia Naduieva
 * @version 1.0.0
 * @project VSEM
 * @class Cube
 * @since 19.03.2021 - 15.49
 **/

public class Cube2 implements IGeometry, IPacking {
    private double cubeEdge; // One variable because in a cube all edges are equal

    public Cube2() {
    }

    public Cube2(double cubeEdge) {
        this.cubeEdge = cubeEdge;
    }

    public double getCubeEdge() {
        return cubeEdge;
    }

    public void setCubeEdge(double cubeEdge) {
        this.cubeEdge = cubeEdge;
    }

    public double getDiagonalCube() {
        return (this.getCubeEdge() * Math.sqrt(3));
    }

    public double getDiagonalEdge() {
        return (this.getCubeEdge() * Math.sqrt(2));
    }

    public double getPerimeter() {
        return (12 * this.getCubeEdge());
    }

    public double getArea() {
        return (6 * Math.pow(this.getCubeEdge(), 2));
    }

    public double getVolume() {
        return (Math.pow(this.getCubeEdge(), 3));
    }

    @Override
    public String toString() {
        return "Cube {" +
                "cubeEdge = " + this.getCubeEdge() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube2 cube = (Cube2) o;
        return Double.compare(cube.getCubeEdge(), getCubeEdge()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCubeEdge());
    }

    @Override
    public String toJSON() {
        String json = "Cube " + "{" + "\"" + "cube edge" + "\"" + ": " + this.getCubeEdge() + " }";
        return json;
    }

    @Override
    public String toXML() {
        String xml = "<Cube>" +
                " <cube edge> " + this.getCubeEdge() + " </cube edge>" +
                " </Cube>";
        return xml;
    }
}
