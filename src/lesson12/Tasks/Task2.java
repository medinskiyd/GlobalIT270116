package lesson12.Tasks;

import java.util.*;
/**
 * Как одной строчкой преобразовать ArrayList в HashSet?
 */
public class Task2 {

    public static void main(String... args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("B");

        // Преобразование.
        System.out.println(list);
        Set<String> set = new HashSet<>(list);

        System.out.println(set.toString());
    }

}
