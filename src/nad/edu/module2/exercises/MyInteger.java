package nad.edu.module2.exercises;

/**
 * @author Mariia Naduieva
 * @version 1.0.0
 * @project VSEM
 * @class MyInteger
 * @since 27.03.2021 - 17.02
 **/

public class MyInteger {
    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("100 is prime, it's - " + isPrime(100));
        System.out.println("11 is prime, it's - " + isPrime(11));
        System.out.println("23 is prime, it's - " + isPrime(23));
    }
}

/*
100 is prime, it's - false
11 is prime, it's - true
23 is prime, it's - true
 */
