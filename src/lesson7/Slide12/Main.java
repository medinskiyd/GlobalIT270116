package lesson7.Slide12;

/**
 * Created by dmitry on 16.02.16.
 */
public class Main {

    public static void main(String[] args) {

        Child c = new Child();

        c.methodToOverride(); //На экране появится child method

        c.methodToHide(); //child method to hide

        Parent p = new Parent();

        p.methodToOverride(); //parent method

        p.methodToHide(); //parent method to hide

        p = new Child();

        p.methodToOverride(); //child method

        p.methodToHide(); //parent method to hide

    }

}
