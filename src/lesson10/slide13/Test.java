package lesson10.slide13;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 25.02.16.
 */
class Test {
    static void printList(List<?> list) {
        for (Object l : list)
            System.out.println("{" + l + "}");
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(100);
        printList(list);

        List<String> strList = new ArrayList<>();
        strList.add("10");
        strList.add("100");
        printList(strList);

        System.out.println();

        System.out.println(list.toString());
        System.out.println(strList.toString());
    }
}
