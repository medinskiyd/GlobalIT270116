package lesson9.task2;

/**
 * Created by dmitry on 23.02.16.
 */
public class OuterClass {

    public static void main(String[] args) {

    }

    private static int a = 100;
    private int b = 50;

    static class StaticNestedClass {
        static void staticMetod() {
            System.out.println(a);
            //System.out.println(b); - к b мы не можем обратится, так
            // как переменная не статическая.
        }
    }

    public int getB() {
        return b;
    }

    static{
        StaticNestedClass sNC = new StaticNestedClass();
        sNC.staticMetod();
    }
}
