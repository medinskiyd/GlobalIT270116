package lesson3.HomeWork;

/**
 * Created by dmitry on 03.02.16.
 */
public class First {

    public static void main(String[] args) {

        //Создайте программу, выводящую на экран первые 20 элементов последовательности
        // 2 4 8 16 32 64 128 ….

        int i = 0;
        int x = 2;
        while (i < 20) {
            i++;
            System.out.println(x);
            x = x*2;
        }

    }

}
