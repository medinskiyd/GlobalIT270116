package lesson3;

/**
 * Created by dmitry on 03.02.16.
 */
public class Continue2Example {

    public static void main(String[] args) {

        outer: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.print("\n");
                    continue outer;
                }
                System.out.print(" " + (i * j));
            }
        }

    }

}
