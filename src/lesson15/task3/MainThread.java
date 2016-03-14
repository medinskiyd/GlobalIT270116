package lesson15.task3;

/**
 * Created by dmitry on 23.12.15.
 */
public class MainThread {
    public static void main(String[] args) {
        MyThread nr = new MyThread();
        Thread one = new Thread(nr);
        Thread two = new Thread(nr);
        Thread three = new Thread(nr);

        one.setName("Первый");
        two.setName("Второй");
        three.setName("Третий");

        one.start();
        two.start();
        three.start();
    }
}

