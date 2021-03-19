package nad.edu.module2.design;

/**
 * @author Mariia Naduieva
 * @version 1.0.0
 * @project VSEM
 * @class MainCube
 * @since 19.03.2021 - 15.50
 **/

public class MainCube {
    public static void main(String[] args) {
        Cube c1 = new Cube(3);
        System.out.println(c1.toString());
        System.out.println("Cube perimeter: " + c1.getPerimeter());
        System.out.println("Cube area: " + c1.getArea());
        System.out.println("Diagonal of the edge of the cube: " + c1.getDiagonalEdge());
        System.out.println("Cube diagonal: " + c1.getDiagonalCube());
        System.out.println("Cube volume: " + c1.getVolume());
        System.out.println("HashCode: " + c1.hashCode());
    }
}
