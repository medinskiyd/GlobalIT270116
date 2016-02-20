package lesson8.pack3;

/**
 * Created by dmitry on 20.02.16.
 */
public class Test {
    public static void main(String s[]) {
        Operation o1 = new Addition();
        System.out.println(o1.calculate(2, 3));

        Operation o2 = new Subtraction();
        System.out.println(o2.calculate(3, 5));
    }
}
