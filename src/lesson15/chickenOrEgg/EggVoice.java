package lesson15.chickenOrEgg;

/**
 * Created by dmitry on 23.12.15.
 */
class EggVoice extends Thread
{
    @Override
    public void run()
    {
        for(int i = 0; i < 1000; i++)
        {
            try{
                sleep(1000);		//Приостанавливает поток на 1 секунду
            }catch(InterruptedException e){}

            System.out.println("яйцо!");
        }
        //Слово «яйцо» сказано 5 раз
    }
}

