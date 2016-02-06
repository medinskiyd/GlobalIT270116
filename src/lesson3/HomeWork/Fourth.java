package lesson3.HomeWork;

import java.lang.Math;
import java.util.Scanner;

/**
 * Created by dmitry on 03.02.16.
 */
public class Fourth {

    //Загадано число от 0 до 100. У вас будет семь попыток на угадывание.
    // При каждой попытке вам будет выводиться сообщение - "Мало" или "Много".
    // Если угадаете, уложившись в семь попыток, то выиграли.
    // Также прекратить игру, если выграли досрочно.
    // (Генерируем число от 0 до 100 "int secret = (int)(Math.random() * 100);")

    public static void main(String[] args) {

        int x;
        int secret = (int)(Math.random() * 100);
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 7; i++){
            System.out.println("Введите число от 0 до 100: ");
            x = scanner.nextInt();

            if (x == secret){
                System.out.println("Вы угадали число!");
                break;
            } else {
                System.out.println("Вы не угадали число!");
            }
        }




    }


}
