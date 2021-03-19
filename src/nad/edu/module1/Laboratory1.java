package nad.edu.module1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * @author Mariia Naduieva
 * @version 1.0.0
 * @project VSEM
 * @class Laboratory1
 * @since 15.03.2021 - 18.02
 **/

public class Laboratory1 {
    public static void main(String[] args) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get("C:\\Users\\Maria\\Desktop\\harry.txt")));
        text = text.replaceAll("[^A-Za-z ']", "");
        String[] words = text.split(" +");

        // 1.  Find the longest word in the above text.
        String longestWord = "";
        for (String s1 : words) {
            if (s1.length() > longestWord.length()) {
                longestWord = s1;
            }
        }

        // 2. Count the LINES where the word "Harry" is met.
        String textLines = new String(Files.readAllBytes(Paths.get("C:\\Users\\Maria\\Desktop\\harry.txt")));
        String[] lines = textLines.split("\\n");
        textLines = textLines.replaceAll("[^A-Za-z ']", "");
        int counterHarry = 0;
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].contains("Harry")) {
                counterHarry++;
            }
        }

        // 3. Take  the array of distinct words from Harry Potter.
        String stringOfDistincts = "";
        for (int i = 0; i < words.length; i++) {
            if (!stringOfDistincts.contains(words[i])) {
                stringOfDistincts += words[i] + " ";
            }
        }
        String[] distincts = stringOfDistincts.split(" ");

        // 4.  How many distinct words begin from the letter "C".
        int counterC = 0;
        for (int i = 0; i < distincts.length; i++) {
            if (distincts[i].startsWith("C") || distincts[i].startsWith("C")) {
                counterC++;
            }
        }

        //5. Create an array of hashes.
        int[] hashes = new int[distincts.length];
        for (int i = 0; i < hashes.length; i++) {
            hashes[i] = distincts[i].hashCode();
        }

        // 6. Count the intersections of hashes.
        Arrays.sort(hashes);
        int counterHashes = 0;
        for (int i = 0; i < hashes.length - 1; i++) {
            if (hashes[i] == hashes[i + 1]) {
                counterHashes++;
            }
        }

        System.out.println("The longest word in the text: " + longestWord); // interestinglooking
        System.out.println("Count the LINES where the word \"Harry\" is met: " + counterHarry); // 1084
        System.out.println("Number of distinct words begin from the letter \"C\": " + counterC); // 80
        System.out.println("Count the intersections of hashes: " + counterHashes); // 0
    }
}
