package lesson13;

/**
 * Created by dmitry on 07.03.16.
 *
 * Пример деления на 0.
 */
public class Task1 {

    public static void main(String[] args) {

        int myNumber;
        int zero;

        myNumber = 2;
        zero = 0;

//        int result1 = myNumber / zero;

        try {
            int result = myNumber / zero;
            System.out.println("Деление прошло успешно.");
        } catch (ArithmeticException e) {
            System.out.println("Нельзя делить на ноль!");
        }

        System.out.println("Жизнь продолжается");

    }

}
