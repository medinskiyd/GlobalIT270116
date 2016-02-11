package lesson5.example7Slide28;

/**
 * Created by dmitry on 10.02.16.
 */
public class Main {

    public static void main(String[] args) {

        Example e = new Example();
        //e.data; - недопустимая команда, так как переменная data имеет модификатор доступа private.
        System.out.println(e.getData());
        //System.out.println(e.getF());

        Example e1 = new Example(42);


    }

}
