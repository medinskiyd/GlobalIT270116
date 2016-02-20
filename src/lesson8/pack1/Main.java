package lesson8.pack1;

/**
 * Created by dmitry on 20.02.16.
 */
public class Main {
    public static void main(String[] args) {

        A ob1;
        // ошибка: ob1 = new A();
        B ob2 = new B(); // будет вызван конструктов по умолчанию из A
        ob2.print();
    }
}
