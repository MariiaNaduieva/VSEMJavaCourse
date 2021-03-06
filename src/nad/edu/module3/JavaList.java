package nad.edu.module3;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author Mariia Naduieva
 * @version 1.0.0
 * @project VSEM
 * @class JavaList
 * @since 02.04.2021 - 16.16
 **/

public class JavaList {
    public static void main(String[] args) {

        Random random = new Random();
        int r1 = random.nextInt(1000);

        System.out.println("CREATE");

        // create array list
        List<Integer> arrayList = new ArrayList<>();

        LocalDateTime start = LocalDateTime.now();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(r1);
        }

        LocalDateTime finish = LocalDateTime.now();
        int duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("- Duration to create Array List: " + duration + " msec");

        // create linked list
        List<Integer> linkedList = new LinkedList<>();
        start = LocalDateTime.now();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(r1);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("- Duration to create Linked List: " + duration + " msec");

        System.out.println("Array List size: " + arrayList.size());
        System.out.println("Linked List size: " + linkedList.size() + "\n");
        System.out.println("INSERT TO HEAD");

        // insert to head Array List
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(i, r1);
        }
        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("- Duration to insert to head Array List: " + duration + " msec");

        // insert to head Linked List
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.add(i, r1);
        }
        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("- Duration to insert to head Linked List: " + duration + " msec");

        System.out.println("Array List size: " + arrayList.size());
        System.out.println("Linked List size: " + linkedList.size() + "\n");
        System.out.println("INSERT TO MIDDLE");

        int middleArrayList = arrayList.size() / 2;
        int middleLinkedList = linkedList.size() / 2;

        // insert to middle Array List
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(middleArrayList, r1);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("- Duration to insert to middle Array List: " + duration + " msec");

        // insert to middle Linked List
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.add(middleLinkedList, r1);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("- Duration to insert to middle Linked List: " + duration + " msec");

        System.out.println("Array List size: " + arrayList.size());
        System.out.println("Linked List size: " + linkedList.size() + "\n");
        System.out.println("INSERT TO TAIL");

        // insert to tail Array List
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            arrayList.add(arrayList.size() - 1, r1);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("- Duration to insert to tail Array List: " + duration + " msec");

        // insert to tail Linked List
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.add(linkedList.size() - 1, r1);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("- Duration to insert to tail Linked List: " + duration + " msec");

        System.out.println("Array List size: " + arrayList.size());
        System.out.println("Linked List size: " + linkedList.size() + "\n");
        System.out.println("UPDATE FROM HEAD");

        // update from head Array List
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            arrayList.set(i, r1);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("- Duration to update from head Array List: " + duration + " msec");

        // update from head Linked List
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.set(i, r1);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("- Duration to update from head Linked List: " + duration + " msec");

        System.out.println("Array List size: " + arrayList.size());
        System.out.println("Linked List size: " + linkedList.size() + "\n");
        System.out.println("UPDATE FROM MIDDLE");

        // update from middle Array List
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            arrayList.set(middleArrayList, r1);
            middleArrayList++;
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("- Duration to update from middle Array List: " + duration + " msec");

        // update from middle Linked List
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.set(middleLinkedList, r1);
            middleLinkedList++;
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("- Duration to update from middle Linked List: " + duration + " msec");

        System.out.println("Array List size: " + arrayList.size());
        System.out.println("Linked List size: " + linkedList.size() + "\n");
        System.out.println("UPDATE FROM TAIL");

        // update from tail Array List
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            arrayList.set(arrayList.size() - 1, r1);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("- Duration to update from tail Array List: " + duration + " msec");

        // update from tail Linked List
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.set(linkedList.size() - 1, r1);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("- Duration to update from tail Linked List: " + duration + " msec");

        System.out.println("Array List size: " + arrayList.size());
        System.out.println("Linked List size: " + linkedList.size() + "\n");
        System.out.println("DELETE FROM HEAD");

        // delete from head Array List
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            arrayList.remove(i);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("- Duration to delete from head Array List: " + duration + " msec");

        // delete from head Linked List
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.remove(i);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("- Duration to delete from head Linked List: " + duration + " msec");

        System.out.println("Array List size: " + arrayList.size());
        System.out.println("Linked List size: " + linkedList.size() + "\n");
        System.out.println("DELETE FROM MIDDLE");

        // delete from middle Array List
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            arrayList.remove(middleArrayList);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("- Duration to delete from middle Array List: " + duration + " msec");

        // delete from middle Linked List
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.remove(middleLinkedList);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("- Duration to delete from middle Linked List: " + duration + " msec");

        System.out.println("Array List size: " + arrayList.size());
        System.out.println("Linked List size: " + linkedList.size() + "\n");

        System.out.println("DELETE FROM TAIL");

        // delete from tail Array List
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            arrayList.remove(arrayList.size() - 1);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("- Duration to delete from tail Array List: " + duration + " msec");

        // delete from tail Linked List
        start = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            linkedList.remove(linkedList.size() - 1);
        }

        finish = LocalDateTime.now();
        duration = (int) ChronoUnit.MILLIS.between(start, finish);
        System.out.println("- Duration to delete from tail Linked List: " + duration + " msec");

        System.out.println("Array List size: " + arrayList.size());
        System.out.println("Linked List size: " + linkedList.size() + "\n");
    }
}

/*
CREATE
- Duration to create Array List: 277 msec
- Duration to create Linked List: 57 msec
Array List size: 100000
Linked List size: 100000

INSERT TO HEAD
- Duration to insert to head Array List: 125 msec
- Duration to insert to head Linked List: 22 msec
Array List size: 101000
Linked List size: 101000

INSERT TO MIDDLE
- Duration to insert to middle Array List: 36 msec
- Duration to insert to middle Linked List: 405 msec
Array List size: 102000
Linked List size: 102000

INSERT TO TAIL
- Duration to insert to tail Array List: 0 msec
- Duration to insert to tail Linked List: 0 msec
Array List size: 103000
Linked List size: 103000

UPDATE FROM HEAD
- Duration to update from head Array List: 0 msec
- Duration to update from head Linked List: 2 msec
Array List size: 103000
Linked List size: 103000

UPDATE FROM MIDDLE
- Duration to update from middle Array List: 1 msec
- Duration to update from middle Linked List: 206 msec
Array List size: 103000
Linked List size: 103000

UPDATE FROM TAIL
- Duration to update from tail Array List: 1 msec
- Duration to update from tail Linked List: 0 msec
Array List size: 103000
Linked List size: 103000

DELETE FROM HEAD
- Duration to delete from head Array List: 82 msec
- Duration to delete from head Linked List: 4 msec
Array List size: 102000
Linked List size: 102000

DELETE FROM MIDDLE
- Duration to delete from middle Array List: 18 msec
- Duration to delete from middle Linked List: 363 msec
Array List size: 101000
Linked List size: 101000

DELETE FROM TAIL
- Duration to delete from tail Array List: 0 msec
- Duration to delete from tail Linked List: 0 msec
Array List size: 100000
Linked List size: 100000

Conclusion: If you insert or delete a lot of items of a collection,
it is better to use LinkedList. In all other cases, use ArrayList.
 */
