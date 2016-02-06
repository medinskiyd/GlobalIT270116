package lesson3.HomeWork;

import java.util.Scanner;

/**
 * Created by dmitry on 03.02.16.
 */
public class Third {

    // Пользователь вводит трёхзначное число. Найти сумму цифр этого числа.

    public static void main(String[] args) {

        int x;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 3-х значное число: ");

        x = scanner.nextInt();

        int first = x % 10;
        int second = (x /10) % 10;
        int third = x / 100;

        int sum = first + second + third;

        System.out.println(sum);


    }

}