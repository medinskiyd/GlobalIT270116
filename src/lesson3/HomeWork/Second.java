package lesson3.HomeWork;

/**
 * Created by dmitry on 03.02.16.
 */
public class Second {

    // Создайте программу, выводящую на экран все четырёхзначные числа последовательности
    // 1000 1003 1006 1009 1012 1015 ....

    //Создадим цикл, который выводит значение переменной
    // a (которая по умолчанию равна 1000), каждый раз,
    // когда переменная увеличивается на 3 пока не достигнет 9999.

    public static void main(String[] args){
        for(int a=1000;a<=9999;a=a+3){
            System.out.print(a+" ");
        }
    }

}
