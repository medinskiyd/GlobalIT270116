package lesson12.Tasks;

import java.util.*;
/**
 * Как одним вызовом копировать элементы из любой Collection в массив?
 */
public class Task3 {

    public static void main(String... args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("B");
        //Копируем объекты коллекции в массив
        String[] strArray = list.toArray(new String[list.size()]);
        //Выводим элементы массива
        for(int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + " ");
        }
    }

}
