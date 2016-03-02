package lesson11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by dmitry on 01.03.16.
 */
public class TestHashMap {

    public static void main(String[] args) {

        // Создадим хешмап
        Map<String, Integer> hm = new HashMap<>();

    // Помещаем данные на карточку
        hm.put("Васька", new Integer(6));
        hm.put("Мурзик", new Integer(8));
        hm.put("Рыжик", new Integer(12));
        hm.put("Барсик", new Integer(5));

    // Получаем набор элементов
        Set<Map.Entry<String, Integer>> set = hm.entrySet();

    // Отобразим набор
        for (Map.Entry<String, Integer> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

    // Добавляем значение
        int value = hm.get("Васька");
        hm.put("Васька", value + 3);
        System.out.println("У Рыжика стало " + hm.get("Васька"));

    }

}
