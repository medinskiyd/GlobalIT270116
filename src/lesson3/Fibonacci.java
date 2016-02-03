package lesson3;

/**
 * Created by dmitry on 03.02.16.
 */
public class Fibonacci {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int result = num1 + num2;

        System.out.println(num1 + " ");
        System.out.println(num2 + " ");

        while (result < 150) {
            System.out.println(result + " ");
            num1 = num2;
            num2 = result;
            result = num1 + num2;
        }
    }
}