package nad.edu.finalTesting;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Mariia Naduieva
 * @version 1.0.0
 * @project VSEM
 * @class Glossary
 * @since 19.04.2021 - 18.02
 **/

public class Glossary {
    public static void main(String[] args) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get("C:\\Users\\Maria\\Desktop\\harry.txt")));
        text = text.toLowerCase(Locale.ROOT).replaceAll("[^A-Za-z ]", "");
        String[] array = text.split(" +");
        List<String> list = Arrays.stream(array).collect(Collectors.toList());
        Set<String> distincts = list.stream().collect(Collectors.toSet());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], 1);
            } else {
                Integer value = map.get(array[i]);
                map.put(array[i], value + 1);
            }
        }
        Map<String, Integer> sorted = new LinkedHashMap<>();
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEachOrdered(entry -> sorted.put(entry.getKey(), entry.getValue()));
        sorted.entrySet().stream().limit(20).forEach(System.out::println);

        String sorted20 = "--- First 20 distinct word in Harry Potter by the number of occurrence ---" + '\n';
        int counter = 0;
        for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
            counter++;
            sorted20 += entry.getKey() + " " + entry.getValue() + "\n";
            if (counter == 20) break;
        }

        String fileOutput = "C:\\Users\\Maria\\Desktop\\exam.txt";
        Files.write(Paths.get(fileOutput), sorted20.getBytes());
    }
}
/*
--- First 20 distinct word in Harry Potter by the number of occurrence ---
the 3628
and 1919
to 1856
a 1688
he 1528
of 1259
harry 1214
was 1186
it 1026
in 964
his 937
you 863
said 794
had 702
i 652
on 636
at 625
that 601
they 597
as 526
 */

