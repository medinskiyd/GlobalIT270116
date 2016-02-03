package lesson3;

/**
 * Created by dmitry on 03.02.16.
 */
public class ContinueExample {

    public static void main(String[] args) {

        for (int i=0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) continue;
            System.out.println("");
        }
    }
}
