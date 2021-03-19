package nad.edu.module1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * @author Mariia Naduieva
 * @version 1.0.0
 * @project VSEM
 * @class HarryPotter
 * @since 12.03.2021 - 17.54
 **/

public class HarryPotter {
    public static void main(String[] args) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get("C:\\Users\\Maria\\Desktop\\harry.txt")));
        text = text.replaceAll("[^A-Za-z ']", "");
        String[] words = text.split(" +");
        String stringOfDistincts = "";
        for (int i = 0; i < words.length; i++) {
            if (!stringOfDistincts.contains(words[i])) {
                stringOfDistincts += words[i] + " ";
            }
        }
        String[] distincts = stringOfDistincts.split(" ");
        Arrays.sort(distincts);
        System.out.println("Number of distinct words: " + distincts.length);
        System.out.println("Distinct words in alphabetic order:");
        for (int i = 0; i < 100; i++) {
            System.out.println(distincts[i]);
        }
    }
}

/**
 * 'Alohomora
 * 'Atta
 * 'Cause
 * 'Course
 * 'Dumbledore
 * 'Harry's
 * 'Jordan
 * 'Mr
 * 'NMat
 * 'Oh
 * 'Pig
 * 'Quidditch'
 * 'Scuse
 * 'Snot
 * 'Up'
 * 'Yes
 * 'You
 * 'YouKnowWho'
 * 'cause
 * 'cept
 * 'f'
 * 'gar'
 * 'hocus
 * 'm'
 * 'please'
 * 's'
 * 'smatter
 * 'there's
 * 'til
 * 'to
 * 'undred
 * 'wand
 * AAAAAAAAAARGH
 * ALBUS
 * ALL
 * ALLEY
 * ALLOWED
 * AM
 * AND
 * ANYTHING
 * AT
 * Aaah
 * Aargh
 * Abbott
 * Abou'
 * About
 * Absolutely
 * According
 * Adalbert
 * Add
 * Adrian
 * Africa
 * African
 * After
 * Against
 * Ages
 * Agrippa
 * Ah
 * Aha
 * Ahead
 * Ahem
 * Ahern
 * Alas
 * Alberic
 * Albus
 * Algie
 * Alicia
 * All
 * Alley
 * Although
 * Always
 * Am
 * An'
 * And
 * Angelina
 * Another
 * AntiCheating
 * AntiDark
 * Anyone
 * Anythin'
 * Anything
 * Anyway
 * Apothecary
 * Are
 * Aren't
 * Argus
 * Around
 * Arsenius
 * Arts
 * As
 * Asked
 * Astronomy
 * At
 * Ate
 * August
 * Aunt
 * Auntie
 * BC
 * BED
 * BEHIND
 */

