package lesson10;

/**
 * Created by dmitry on 27.02.16.
 */
import java.util.ArrayList;

public class CollectionApp {

    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<String>();
        // добавим в список ряд элементов
        states.add(0, "Италия"); // добавляем элемент по индексу 0
        states.add("Германия");
        states.add("Франция");
        states.add("Великобритания");
        states.add("Испания");


        System.out.println(states.get(1)); // получаем 2-й объект
        states.set(1, "Дания"); // установка нового значения для 2-го объекта

        //форматированный вывод строки. (printf)
        System.out.printf("В %s %d элементов \n", "списке",  states.size());

        for(String state : states){
            System.out.println(state);
        }

        System.out.println();

        if(states.contains("Испания")){

            System.out.println("Список содержит государство Германия");
        }

        // удалим несколько объектов
        states.remove("Германия");
        states.remove(0);

        System.out.println();

        Object[] countries = states.toArray();
        for(Object country : countries){

            System.out.println(country);
        }
    }
}
