package nad.edu.module1;

/**
 * @author Mariia Naduieva
 * @version 1.0.0
 * @project VSEM
 * @class Palindrome
 * @since 12.03.2021 - 17.52
 **/

public class Palindrome {
    public static boolean isPalindrom1(String text) {
        text = text.replaceAll("[^A-Za-zА-Яа-я]", ""); // garbage removal
        text = text.toLowerCase();
        boolean result = true;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                result = false;
                break;
            }
        }
        return result;
    }

    //buid a reverse string
    public static boolean isPalindrom2(String text) {
        text = text.replaceAll("[^A-Za-zА-Яа-я]", ""); //garbage removal
        text = text.toLowerCase();
        boolean result = true;
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }
        return reversed.equals(text);
    }

    // use string builder
    public static boolean isPalindrom3(String text) {
        text = text.replaceAll("[^A-Za-zА-Яа-я]", ""); // garbage removal
        text = text.toLowerCase();
        StringBuilder sb = new StringBuilder(text);
        String reversed = sb.reverse().toString();
        boolean result;
        if (text.equals(reversed)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        String text = "Коту тащат уток";
        System.out.println("The first way:");
        System.out.println(text + " - is a palindrome - " + isPalindrom1(text));
        System.out.println("The second way:");
        System.out.println(text + " - is a palindrome - " + isPalindrom2(text));
        System.out.println("The third way:");
        System.out.println(text + " - is a palindrome - " + isPalindrom3(text));
    }
}
/**
 * The first way:
 * Коту тащат уток - is a palindrome - true
 * The second way:
 * Коту тащат уток - is a palindrome - true
 * The third way:
 * Коту тащат уток - is a palindrome - true
 **/


