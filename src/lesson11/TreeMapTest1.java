package lesson11;

import java.util.TreeMap;

/**
 * Created by dmitry on 01.03.16.
 */
public class TreeMapTest1 {

        public static void main(String[] args) {
            System.out.println("Tree Map Example!");
            TreeMap <Integer, String>tMap = new TreeMap<>();
//Добавляем данные
            tMap.put(1, "Sunday");
            tMap.put(2, "Monday");
            tMap.put(3, "Tuesday");
            tMap.put(4, "Wednesday");
            tMap.put(5, "Thursday");
            tMap.put(6, "Friday");
            tMap.put(7, "Saturday");
//Получаем все ключи
            System.out.println("Keys of tree map: " + tMap.keySet());
//Получаем все значения
            System.out.println("Values of tree map: " + tMap.values());
//Получаем пятое значение
            System.out.println("Key: 5 value: " + tMap.get(5));
//Получаем первый ключ и его значение
            System.out.println("First key: " + tMap.firstKey() + " Value: "
                    + tMap.get(tMap.firstKey()));
//Получаем последние ключ и значение
            System.out.println("Last key: " + tMap.lastKey() + " Value: "
                    + tMap.get(tMap.lastKey()));
//Удаляем первый ключ и значение
            System.out.println("Removing first data: "
                    + tMap.remove(tMap.firstKey()));
            System.out.println("Now the tree map Keys: " + tMap.keySet());
            System.out.println("Now the tree map contain: " + tMap.values());
//Удаляем последний ключ и значение
            System.out.println("Removing last data: "
                    + tMap.remove(tMap.lastKey()));
            System.out.println("Now the tree map Keys: " + tMap.keySet());
            System.out.println("Now the tree map contain: " + tMap.values());
        }
}
