package lesson9.task2;

/**
 * Created by dmitry on 23.02.16.
 */
public class Main {

    public static void main(String[] args) {

        OuterClass.StaticNestedClass.staticMetod();

        OuterClass outerClass = new OuterClass();
        System.out.println(outerClass.getB());
    }

}
