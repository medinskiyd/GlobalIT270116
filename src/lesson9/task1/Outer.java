package lesson9.task1;

/**
 * Created by dmitry on 23.02.16.
 *
 * Нестатические вложенные классы называют также внутренними классами (inner).
 * Внутренний класс имеет доступ ко всем переменным и методам своего внешнего класса
 * и может непосредственно ссылаться на них.
 */
// внешний класс
public class Outer {
    private int outer_x = 9;

    public void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // внутренний класс
    class Inner {
        void display() {
            System.out.println(outer_x);
        }
    }
}



