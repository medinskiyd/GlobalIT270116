package lesson15.task1;

public class MainThread
{

    public static void main(String[] args)
    {
        MyThread mSecondThread = new MyThread();	//Создание потока (Состояние new).
        mSecondThread.start();			//Запуск потока (Состояние runnable)

        System.out.println("Главный поток завершён...");
    }
}
