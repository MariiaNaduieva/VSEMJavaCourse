package nad.edu.module2.design;

import java.util.Objects;

/**
 * @author Mariia Naduieva
 * @version 1.0.0
 * @project VSEM
 * @class Cube
 * @since 19.03.2021 - 15.49
 **/

public class Cube {
    private double cubeEdge;

    public Cube() {
    }

    public Cube(double cubeEdge) {
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
        Cube cube = (Cube) o;
        return Double.compare(cube.getCubeEdge(), getCubeEdge()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCubeEdge());
    }
}
/*
    Cube {cubeEdge = 3.0}
    Cube perimeter: 36.0
    Cube area: 54.0
    Diagonal of the edge of the cube: 4.242640687119286
    Cube diagonal: 5.196152422706632
    Cube volume: 27.0
    HashCode: 1074266143
 */