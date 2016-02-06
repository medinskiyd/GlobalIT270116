package lesson4;

import java.util.Arrays;

/**
 * Created by dmitry on 05.02.16.
 */
public class Mass7Slide11 {

    public static void main(String[] args) {

        //0//Пример////////////////////////////////////////////////

        int[] mas1 = {3, 7, 8, 1, 2, 78, 33, 45, 8, 10}; //Создадим массив
        // из 10 элементов и зададим элементам значения.

        System.out.print("Первый массив: ");
        for (int i = 0; i < mas1.length; i++) {
            System.out.print(mas1[i] + " ");
        }
        System.out.println();

        //1//Пример////////////////////////////////////////////////

        int[] mas2 = new int[10]; //Создадим массив из 10 элементов.

        Arrays.fill(mas2, 24); //Заполняем элементы массива mas2
                                    // значением 24.

        System.out.print("Второй массив: ");
        for (int i = 0; i < mas2.length; i++) {
            System.out.print(mas2[i] + " ");
        }
        System.out.println();

        //2//Пример/////////////////////////////////////////////////

        int[] mas3 = Arrays.copyOfRange(mas1, 2, 7); //Копируем значения
                                                // из массива mas,
                    // начиная с значения №2 и заканчивая значением №7

        System.out.print("Третий массив: ");
        for (int i = 0; i < mas3.length; i++) {
            System.out.print(mas3[i] + " ");
        }
        System.out.println();

        //3//Пример/////////////////////////////////////////////////

        Arrays.sort(mas3); //Сортируем элементы массива по возрастанию.
        System.out.print("Отсортированный третий массив: ");
        for (int i = 0; i < mas3.length; i++) {
            System.out.print(mas3[i] + " ");
        }
        System.out.println();

        //4//Пример/////////////////////////////////////////////////

        System.out.println("Третий массив: " + Arrays.toString(mas3));

    }
}
