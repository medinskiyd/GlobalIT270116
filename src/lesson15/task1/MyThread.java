package lesson15.task1;

/**
 * Created by dmitry on 22.12.15.
 */
class MyThread extends Thread
{
    @Override
    public void run()	//Этот метод будет выполнен в побочном потоке
    {
        System.out.println("Привет из побочного потока!");
    }
}
