package lesson13;

/**
 * Created by dmitry on 07.03.16.
 */
public class Task2 {

    public static void main(String[] args) {
        int myNumber;
        int zero;

        myNumber = 1;
        zero = 1;

        try {
            int result = myNumber / zero;
            String[] myNames = {"AAA", "BBB", "CCC"};
            // Создадим массив из трёх имен
            myNames[3] = "QQQ";
            System.out.println("Не увидите это сообщение!");
        } catch (ArithmeticException e) {
            System.out.println(e.toString() + ": Нельзя делить на ноль!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.toString());
        }

        System.out.println("Увидите это сообщение!");
    }

}
