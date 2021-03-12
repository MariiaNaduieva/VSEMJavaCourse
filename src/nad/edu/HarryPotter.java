package nad.edu;

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
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == 12) {
                counter++;
            }
        }
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
