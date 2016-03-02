package lesson11;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by dmitry on 01.03.16.
 */
public class TreeMapTest {

    public static void main(String[] args) {

        Map treeMap = new TreeMap<>();
        treeMap.put("Bruce", "Willis");
        treeMap.put("Arnold", "Schwarzenegger");
        treeMap.put("Jackie", "Chan");
        treeMap.put("Sylvester", "Stallone");
        treeMap.put("Chuck", "Norris");

        Iterator<Map.Entry<String, String>> itr = treeMap.entrySet().iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

    }

}
