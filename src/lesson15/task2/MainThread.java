package lesson15.task2;

public class MainThread    //Класс с методом main()
{

    public static void main(String[] args)
    {
        MyThread mThing = new MyThread();

        Thread myThread = new Thread(mThing);	//Создание потока "myThread"
        myThread.start();				//Запуск потока

        System.out.println("Главный поток завершён...");
    }
}
