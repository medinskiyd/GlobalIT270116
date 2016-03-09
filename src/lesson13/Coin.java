package lesson13;

/**
 * Created by dmitry on 07.03.16.
 */
import java.util.Random;

    public class Coin {
        public void head() {
            System.out.println("Орел");
        }

        public void tail() {
            System.out.println("Решка");
        }

        public static void main(String[] args) {
            Random rand = new Random();
            int random = 0;

            for (int count = 0; count < 10; ++count) {
                random = rand.nextInt(2);
                if (random > 0) {
                    new Coin().head();
                } else {
                    new Coin().tail();
                }
            }
            System.out.println("Вот и всё!");
        }

    }
