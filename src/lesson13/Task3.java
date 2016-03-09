package lesson13;

/**
 * Created by dmitry on 07.03.16.
 */
public class Task3 {
        static void demoproc() {
            try {
                throw new NullPointerException("demo");
            }
            catch (NullPointerException e) {
                System.out.println("Исключение произошло внутри метода demoproc");
                throw e;
            }
        }

    public static void main(String args[]) {
            try {
                demoproc();
            }
            catch(NullPointerException e) {
                System.out.println("Я отловил исключение e: " + e);
            }
        }
    }
