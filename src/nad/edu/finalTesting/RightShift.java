package nad.edu.finalTesting;

import java.util.Arrays;

/**
 * @author Mariia Naduieva
 * @version 1.0.0
 * @project VSEM
 * @class RightShift
 * @since 19.04.2021 - 18.03
 **/

public class RightShift {
    public static int[] rightShift(int[] array, int step) {
        int[] newArray = new int[array.length];
        int newIndex = 0;
        int newStep = 0;
        if (step >= array.length) {
            newStep = step % array.length;
        } else {
            newStep = step;
        }

        for (int i = 0; i < array.length; i++) {
            newIndex = i + newStep;
            if (i + newStep >= array.length) {
                newIndex = i + newStep - array.length;
            }
            newArray[newIndex] = array[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        System.out.println(Arrays.toString(rightShift(array, 1))); // [30, 10, 20]

        int[] array2 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(rightShift(array2, 2))); // [40, 50, 10, 20, 30]

        int[] array3 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(rightShift(array3, 21))); // [50, 10, 20, 30, 40]
    }
}

