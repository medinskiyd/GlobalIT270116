package lesson12;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by dmitry on 03.03.16.
 */
public class TestLinkedHashSet {

    public static void main(String[] args) {

        Set<String> stringSet = new LinkedHashSet<>();
        stringSet.add("2");
        stringSet.add("1");
        stringSet.add("2");
        stringSet.add("4");
        stringSet.add("3");
        stringSet.add("5");
        stringSet.add("3");
        //Выводим на экран все элементы коллекции
        for( String entry : stringSet ) {
            System.out.print(entry + " ");
        }
        System.out.println(); // выводим на экран размер коллекции
        System.out.println("Размер коллекции: " + stringSet.size());
        //удаляем элемент с коллекции
        String a = "29";
        if(stringSet.contains(a)) {
            stringSet.remove(new String(a));
            System.out.println(a + " элемент удален");
        } else {
            System.out.println("данного элемента нет");//stringSet.remove("29");
        }

        for( String entry : stringSet ) {
            System.out.print(entry + " ");
        }
        System.out.println();
        System.out.println("Размер коллекции: " + stringSet.size());
    }

}
