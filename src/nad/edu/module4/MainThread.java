package nad.edu.module4;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 * @author Mariia Naduieva
 * @version 1.0.0
 * @project VSEM
 * @class MainThread
 * @since 16.04.2021 - 16.12
 **/

public class MainThread {
    public static void main(String[] args) throws IOException {

        LocalDate date = LocalDate.of(2020, Month.JANUARY, 1);
        LocalDateTime start = LocalDateTime.now();

        for (int i = 0; i < 5; i++) {
            LogsService.getLogsCountByDate(date.plusDays(i));
        }

        for (int i = 0; i < 5; i++) {
            LogsService.logsByDateToFile("C:\\Users\\Maria\\Desktop\\logs.txt", date.plusDays(i));
        }

        LocalDateTime finish = LocalDateTime.now();

        System.out.println("Duration is " + ChronoUnit.MILLIS.between(start, finish) + " msec" + '\n');

        System.out.println("MultiThread" + '\n');

        date = LocalDate.of(2020, Month.JANUARY, 1);

        for (int i = 0; i < 5; i++) {
            new MyThread(date.plusDays(i)).start();
        }

        for (int i = 0; i < 5; i++) {
            LogsService.logsByDateToFile("C:\\Users\\Maria\\Desktop\\logs.txt", date.plusDays(i));
        }
    }
}
/*

2020-01-01 165
2020-01-02 782
2020-01-03 4765
2020-01-04 205
2020-01-05 93
Duration is 30059 msec

MultiThread

Thread-1 has been started at 2021-04-16T16:46:25.286
Thread-2 has been started at 2021-04-16T16:46:25.287
Thread-3 has been started at 2021-04-16T16:46:25.288
Thread-4 has been started at 2021-04-16T16:46:25.288
Thread-0 has been started at 2021-04-16T16:46:25.286

2020-01-05 93
Thread-4 has been finished 2021-04-16T16:46:31.433
Thread-4 duration is 6145 msec

2020-01-01 165
Thread-0 has been finished 2021-04-16T16:46:31.656
Thread-0 duration is 6370 msec

2020-01-02 782
Thread-1 has been finished 2021-04-16T16:46:31.822
Thread-1 duration is 6536 msec

2020-01-03 4765
Thread-2 has been finished 2021-04-16T16:46:31.877
Thread-2 duration is 6590 msec

2020-01-04 205
Thread-3 has been finished 2021-04-16T16:46:32.043
Thread-3 duration is 6755 msec

Сonclusion: The speed of multi-threading is higher, but it is less convenient.
Without multi-threading the read and write speed is 30059 msec.
With multi-threading, the speed between the beginning of the first thread and the end of the last thread ~ 0.1 sec.

 */
