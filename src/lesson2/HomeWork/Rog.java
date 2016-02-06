package lesson2.HomeWork;

import java.util.Scanner;

/**
 * Created by dmitry on 31.01.16.
 */
public class Rog {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;
        double b;
        double c;

        System.out.println("Введите целое число: ");
        a = sc.nextInt();

        System.out.println("Введите рациональное число: ");
        b = sc.nextDouble();

        c = a * b;

        System.out.println("Умножение чисел = " + c);

    }

}
