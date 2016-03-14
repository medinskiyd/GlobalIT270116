package lesson15.chickenOrEgg;

/**
 * Created by dmitry on 23.12.15.
 */
public class ChickenVoice	//Класс с методом main()
{

    public static void main(String[] args)
    {
        EggVoice eggOpinion = new EggVoice();	//Создание потока
        System.out.println("Спор начат...");
        eggOpinion.start(); 			//Запуск потока

        for(int i = 0; i < 1000; i++)
        {
            try{
                Thread.sleep(1000);		//Приостанавливает поток на 1 секунду
            }catch(InterruptedException e){}

            System.out.println("курица!");
        }
        //Слово «курица» сказано 5 раз


        if(eggOpinion.isAlive())	//Если оппонент еще не сказал последнее слово
        {
            try{
                eggOpinion.join();	//Подождать пока оппонент закончит высказываться.
            }catch(InterruptedException e){}

            System.out.println("Первым появилось яйцо!");
        }
        else	//если оппонент уже закончил высказываться
        {
            System.out.println("Первой появилась курица!");
        }
        System.out.println("Спор закончен!");
    }
}
