package nad.edu.module2.factory;

import nad.edu.module2.polymorphism.Cube2;

/**
 * @author Mariia Naduieva
 * @version 1.0.0
 * @project VSEM
 * @class CubeFactory
 * @since 26.03.2021 - 17.26
 **/

public class CubeFactory {
    public static Cube2 create(int a) {
        if (a <= 0) {
            return null;
        }
        return new Cube2((int) a);
    }
}
