package lesson12.Tasks;

import java.util.*;
//import java.util.*;

/**
 *
 * Как одной строчкой преобразовать HashSet в ArrayList?
 */
public class Task1 {

    public static void main(String... args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("B");
        // Преобразование.
        System.out.println(set.toString());
        List<String> list = new ArrayList<>(set);

        System.out.println(list.toString());
    }

}
