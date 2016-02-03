package lesson3;

/**
 * Created by dmitry on 03.02.16.
 */
public class BreakExample {

    public static void main(String[] args) {

        int i = 0;

        while(i < 100) {
            if(i == 5) break; // выходим из цикла, если i равно 5
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("Цикл завершён");

    }

}
