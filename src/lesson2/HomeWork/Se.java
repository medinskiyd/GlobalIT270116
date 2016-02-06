package lesson2.HomeWork;

import java.util.Scanner;

/**
 * Created by dmitry on 01.02.16.
 */
public class Se {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner sc = new Scanner(System.in);
        int a;
        double  b,c;
        a=sc.nextInt();
        System.out.println("Введите второе число");
        b=sc.nextDouble();
        c=a*b;
        System.out.println(c);

    }
}
