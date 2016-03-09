package lesson13;

/**
 * Created by dmitry on 07.03.16.
 */
class Task5 {
    static void procedure() throws IllegalAccessException {
        System.out.println("Внутреннее сообщение");
        throw new IllegalAccessException("Новое исключение");
    }

    public static void main(String aigs[]) {
        try {
            procedure();
        } catch (IllegalAccessException e) {
            System.out.println("Сообщение: " + e);
        }
    }
}


