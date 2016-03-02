package lesson11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by dmitry on 01.03.16.
 */
public class HW {

    public static void main(String[] args) {

        Map<String, Integer> hm = new HashMap<String, Integer>();

        // Помещаем данные на карточку
        hm.put("Васька", new Integer(5));
        hm.put("Мурзик", new Integer(8));
        hm.put("Рыжик", new Integer(12));
        hm.put("Барсик", new Integer(5));

        Map<String, Integer> tm = new TreeMap<String, Integer>();

        // Помещаем данные на карточку
        tm.put("Васька", new Integer(5));
        tm.put("Мурзик", new Integer(8));
        tm.put("Рыжик", new Integer(12));
        tm.put("Барсик", new Integer(5));

        Map<String, Integer> lhm = new LinkedHashMap<String, Integer>();

        // Помещаем данные на карточку
        lhm.put("Васька", new Integer(5));
        lhm.put("Мурзик", new Integer(8));
        lhm.put("Рыжик", new Integer(12));
        lhm.put("Барсик", new Integer(5));

        long time = System.nanoTime();
        System.out.println(hm.values());
        System.out.println(hm.keySet());
        long needTime = time - System.nanoTime();
        System.out.println(needTime + " - нужно для HashMap");

        long time1 = System.nanoTime();
        System.out.println(tm.values());
        System.out.println(tm.keySet());
        long needTime1 = time1 - System.nanoTime();
        System.out.println(needTime + " - нужно для TreeMap");

        long time2 = System.nanoTime();
        System.out.println(lhm.values());
        System.out.println(lhm.keySet());
        long needTime2 = time2 - System.nanoTime();
        System.out.println(needTime + " - нужно для LinkedHashMap");
    }

}
