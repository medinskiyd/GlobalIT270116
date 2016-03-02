package lesson11;


import java.util.*;

/**
 * Created by dmitry on 01.03.16.
 */
public class TestIterator {

    public static void main(String[] args) {

        // Коллекция ArrayList
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Iterator iter = list.iterator();

        while (iter.hasNext()) {
            String element = (String) iter.next();
            System.out.println(element.toString());
        }

        Map<String, String> hashmap = new HashMap<>();
        hashmap.put(null, "Hwr");
        hashmap.put("null","Hrs");
        hashmap.put("Hello2", "Her");


        Iterator<Map.Entry<String, String>> itr =
                hashmap.entrySet().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println(hashmap.get(null));


    }
}
