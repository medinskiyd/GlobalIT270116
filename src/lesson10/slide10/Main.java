package lesson10.slide10;

/**
 * Created by dmitry on 25.02.16.
 */
public class Main {

    public static void main(String[] args) {

        // Используем созданный класс
        TwoGen<Integer, String> twogenObj = new TwoGen<>(156, "Обобщённый текст");


        twogenObj.showTypes();	// Узнаем типы

        int value = twogenObj.getob1();
        System.out.println("Значение: " + value);

        String str = twogenObj.getob2();
        System.out.println("Значение: " + str);

    }

}
