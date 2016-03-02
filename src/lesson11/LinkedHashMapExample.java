package lesson11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by dmitry on 01.03.16.
 */
public class LinkedHashMapExample {
    public static void main(String[] args) {

        Map<String, Double> linkedHashMap = new HashMap<>();
        linkedHashMap.put("Apple", new Double(91.98));
        linkedHashMap.put("Sony", new Double(16.76));
        linkedHashMap.put("Dell", new Double(30.47));
        linkedHashMap.put("HP", new Double(33.91));
        linkedHashMap.put("IBM", new Double(181.71));

        // Выводим данные LinkedHashMap
        System.out.println("Contents of LinkedHashMap : " + linkedHashMap);

        // Пробегаемся по элементам
        System.out.println("Values of map: ");
        for (String key : linkedHashMap.keySet()) {
            System.out.println(key + ": " + linkedHashMap.get(key));
        }

        // Выводим значение для HP
        System.out.println("The current share price of HP is : "
                + linkedHashMap.get("HP"));

        // Получаем размер LinkedHashMap
        System.out.println("The size of the LinkedHashMap is : " + linkedHashMap.size());

        // Проверяем на пустоту нашу колекцию
        System.out.println("Is LinkedHashMap empty? : " + linkedHashMap.isEmpty());

        // Проверяем находятся ли в нашей колекции следующие значения
        System.out.println("LinkedHashMap contains Sony as key? : " + linkedHashMap.containsKey("Sony"));
        System.out.println("LinkedHashMap contains 999.0 as value? : " + linkedHashMap.containsValue(999.0));

        // Удаляем элемент
        System.out.println("Remove entry for Dell : " + linkedHashMap.remove("Dell"));
        System.out.println("Content of LinkedHashMap removing Dell: " + linkedHashMap);

        // Чистим нашу коллекцию
        linkedHashMap.clear();
        System.out.println("Content of LinkedHashMap after clearing: " + linkedHashMap);
        System.out.println("Is LinkedHashMap empty? : " + linkedHashMap.isEmpty());
    }
}