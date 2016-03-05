package lesson12.Tasks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Сделайте HashSet из HashMap (используйте только множество ключей, но не множество значений).
 */
public class Task5 {

    public static void main(String[] args) {

        Map<Object, Object> map = new HashMap<>();
        map.put("Hello", "Fred");
        map.put("Привет", "Коля");
        map.put("Привіт", "Степан");
        map.put("你好", "Chan");

        //После такого преобразования мы теряем значения,
        // остаются только ключи.
        Set<Object> keySet = new HashSet<>(map.keySet());

        System.out.println(keySet.toString());

    }

}
