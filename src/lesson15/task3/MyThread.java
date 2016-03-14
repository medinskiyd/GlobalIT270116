package lesson15.task3;

/**
 * Created by dmitry on 23.12.15.
 */
class MyThread implements Runnable {
    public void run() {
        for (int x = 1; x <= 100; x++) {
            System.out.println("Запущен "
                    + Thread.currentThread().getName()
                    + ", x равен " + x);
        }
    }
}
