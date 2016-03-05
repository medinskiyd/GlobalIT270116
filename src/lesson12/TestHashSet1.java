package lesson12;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by dmitry on 03.03.16.
 */
public class TestHashSet1 {

    public static void main(String[] args) {

        Random random = new Random();
        // Создаем объект коллекцию типа HashSet
        Set<Integer> intset = new HashSet<>();

        //Пытаемся добавить в коллекцию 1000 элементов
        for(int i = 0; i < 10; i++){
            // Добавляем рандомные элементы от от 0 до 10.
            intset.add(random.nextInt(10));
        }
        // Выводим элементы коллекции на экран
        System.out.println(intset.toString());

    }

}
