package lesson12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by dmitry on 03.03.16.
 */
public class TestClass {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        String[] strArray = list.toArray(new String[list.size()]);
        for(int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        }

}
