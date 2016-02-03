package lesson2;

import java.util.Scanner;

/**
 * Created by dmitry on 29.01.16.
 */
public class SimpleScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x;
        char c = 'a';
        char c1 = '\u0050'; // Выведет символ P
        System.out.println("Введите x (типа int)");

        x= scanner.nextInt();

        System.out.println("Вы ввели: ");

        System.out.println(x);

        System.out.println(c + " " + c1);


    }

}
