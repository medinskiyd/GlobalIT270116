package lesson12;

import java.util.*;

/**
 * Created by dmitry on 03.03.16.
 */
public class TestTreeSet {

    public static void main(String[] args) {

        Random random = new Random();
        SortedSet<Integer> intSet = new TreeSet<>();
        long a = System.nanoTime();
        for(int i = 0; i < 100; i++) {
            intSet.add(random.nextInt(100));
        }
        System.out.println("Время на добавление элементов " + (System.nanoTime() - a));
        System.out.println(intSet.toString());


        Set<Integer> integerHashSet = new HashSet<>();

        long b = System.nanoTime();
        for(int i = 0; i < 100; i++){
            integerHashSet.add(random.nextInt(100));
        }

        System.out.println("Время на добавление элементов " + (System.nanoTime() - b));
        System.out.println(integerHashSet.toString());
    }

}
