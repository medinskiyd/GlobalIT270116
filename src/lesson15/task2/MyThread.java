package lesson15.task2;

/**
 * Created by dmitry on 22.12.15.
 */
public class MyThread implements Runnable	//Реализуем интерфейс Runnable и его абстрактный метод run()
{
    public void run()	//Этот метод будет выполняться в побочном потоке
    {
        System.out.println("Привет из побочного потока!");
    }
}
