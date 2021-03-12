package nad.edu;

/**
 * @author Mariia Naduieva
 * @version 1.0.0
 * @project VSEM
 * @class FactsAboutMe
 * @since 12.03.2021 - 17.50
 **/

public class FactsAboutMe {
    public static void main(String[] args) {
        byte myAge = 23;
        System.out.println("My age is " + myAge + " years.");

        short myYear = 1998;
        System.out.println("I was born in " + myYear + " year.");

        int salary = 200_000;
        System.out.println("I'd like to get " + salary + " $ a month.");

        long myMinutes = 34830000l;
        System.out.println("I live " + myMinutes + " minutes.");

        float myHeight = 165.5f;
        System.out.println("My height is " + myHeight + " сms.");

        double myAnime = 67.8;
        System.out.println("I've watched " + myAnime + " anime.");

        char sign = 'N';
        System.out.println("The first letter of my last name is " + sign + ".");

        boolean isItTrue = true;
        System.out.println("I'm a girl. It is " + isItTrue + ".");

        String line = "Thanks for attention!";
        System.out.println(line);
    }
}
/**
 * My age is 23 years.
 * I was born in 1998 year.
 * I'd like to get 200000 $ a month.
 * I live 34830000 minutes.
 * My height is 165.5 сms.
 * I've watched 67.8 anime.
 * The first letter of my last name is N.
 * I'm a girl. It is true.
 * Thanks for attention!
 **/
