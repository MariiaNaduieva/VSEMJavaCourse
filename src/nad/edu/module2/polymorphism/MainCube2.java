package nad.edu.module2.polymorphism;

import nad.edu.module2.design.Cube;

/**
 * @author Mariia Naduieva
 * @version 1.0.0
 * @project VSEM
 * @class MainCube
 * @since 19.03.2021 - 15.50
 **/

public class MainCube2 {
    public static void main(String[] args) {
        Cube2 c2 = new Cube2(3);
        System.out.println(c2.toString());
        System.out.println("Cube perimeter: " + c2.getPerimeter());
        System.out.println("Cube area: " + c2.getArea());
        System.out.println("Diagonal of the edge of the cube: " + c2.getDiagonalEdge());
        System.out.println("Cube diagonal: " + c2.getDiagonalCube());
        System.out.println("Cube volume: " + c2.getVolume());
        System.out.println("HashCode: " + c2.hashCode());
        System.out.println(c2.toJSON());
        System.out.println(c2.toXML());
    }
}
