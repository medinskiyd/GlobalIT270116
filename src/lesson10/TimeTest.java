package lesson10;
import java.util.*;
/**
 * Created by dmitry on 27.02.16.
 */
public class TimeTest {

        List al = new ArrayList(); // создаем ссылку al типа List и присваиваем ей объект типа ArrayList
        List ll = new LinkedList(); // создаем ссылку ll типа List и присваиваем ей объект типа LinkedList

        void addAL() { //метод добавляет элементы в ArrayList

            for (int i = 0; i < 900; i++)
                al.add(i); //добавляем элемент i в список al
        }

        void addLL() { //метод добавляет элементы в LinkedList

            for (int i = 0; i < 900; i++)
                ll.add(i); //добавляем элемент i в список ll
        }

        void info() { //метод выводит размеры обоих списков
            System.out.println(al.size() + " " + ll.size());
        }

        public static void main(String[] args) {

            TimeTest s = new TimeTest(); //Создаем объект типа TimeTest

            long start = System.nanoTime(); // текущее время
            s.addAL(); //запускаем добавление элементов в список ArrayList

            long duration = System.nanoTime() - start; // отнимаем от текущего времени предыдущее
            System.out.println(duration); //выводим разницу времени

            start = System.nanoTime(); // текущее время
            s.addLL(); //запускаем добавление элементов в список LinkedList
            //
            duration = System.nanoTime() - start; // отнимаем от текущего времени предыдущее
            System.out.println(duration); //выводим разницу времени

            s.info(); // выводим количество элементов в списках
        }
    }
