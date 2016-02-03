package lesson3;

/**
 * Created by dmitry on 03.02.16.
 */
public class DoWhileExample {

    public static void main(String[] args) {

        int counter = 10;

        do {
            System.out.println("Осталось "  + counter);
            counter--;
        } while (counter > 0);

    }

}
