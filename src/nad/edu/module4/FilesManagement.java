package nad.edu.module4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author Mariia Naduieva
 * @version 1.0.0
 * @project VSEM
 * @class FilesManagement
 * @since 11.04.2021 - 16.20
 **/

public class FilesManagement {
    public static void main(String[] args) throws IOException {
        LocalDateTime start = LocalDateTime.now();
        //String.split
        String logs = new String(Files.readAllBytes(Paths.get("C:\\Users\\Maria\\Desktop\\logs.txt")));
        final String[] lines = logs.split("\n");
        System.out.println("Number of logs lines: " + lines.length + '\n');
        System.out.println("String.split:");
        LocalDateTime finish = LocalDateTime.now();
        System.out.println("- Time: " + ChronoUnit.MILLIS.between(start, finish) + " msec");

        int counter = 0;
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].contains("ERROR")) counter++;
        }
        
        System.out.println("- Errors: " + counter + '\n');
        System.out.println("Files.lines.:");

        start = LocalDateTime.now();
        //Files.lines.
        System.out.println("- Errors: " + Files.lines(Paths.get("C:\\Users\\Maria\\Desktop\\logs.txt"))
                .filter(element -> element.contains("ERROR")).count());

        finish = LocalDateTime.now();
        System.out.println("- Time: " + ChronoUnit.MILLIS.between(start, finish) + " msec");
    }
}

/*
Number of logs lines: 2845607

String.split:
- Time: 8580 msec
- Errors: 361

Files.lines.:
- Errors: 361
- Time: 3581 msec

Сonclusion: the Files.lines. is faster than the String.split

 */
