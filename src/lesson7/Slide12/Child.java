package lesson7.Slide12;

/**
 * Created by dmitry on 16.02.16.
 */
public class Child extends Parent {

    @Override
    public void methodToOverride() {
        System.out.println("child method");}

    public static void methodToHide() {
        System.out.println("child method to hide");}

}
