package nad.edu.finalTesting;

import java.util.Arrays;

/**
 * @author Mariia Naduieva
 * @version 1.0.0
 * @project VSEM
 * @class Duplicates
 * @since 19.04.2021 - 18.04
 **/

public class Duplicates {
    public static boolean hasDuplicates(int[] array) {
        Arrays.sort(array);
        boolean hasDuplicates = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    hasDuplicates = true;
                    break;
                }
            }
        }
        return hasDuplicates;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 3, 6, 2, 9, 33, 21};
        System.out.println(hasDuplicates(array));  // false
        array[5] = 1;
        System.out.println(hasDuplicates(array)); // true
    }
}

