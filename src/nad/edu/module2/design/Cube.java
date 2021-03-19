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
        return (cubeEdge * Math.sqrt(3));
    }

    public double getDiagonalEdge() {
        return (cubeEdge * Math.sqrt(2));
    }

    public double getPerimeter() {
        return (12 * cubeEdge);
    }

    public double getArea() {
        return (6 * Math.pow(cubeEdge, 2));
    }

    public double getVolume(){
       return (Math.pow(cubeEdge,3));
    }

    @Override
    public String toString() {
        return "Cube {" +
                "cubeEdge = " + cubeEdge +
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
