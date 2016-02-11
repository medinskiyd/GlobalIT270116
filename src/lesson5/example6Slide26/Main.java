package lesson5.example6Slide26;

/**
 * Created by dmitry on 09.02.16.
 */
public class Main {

    public static void main(String[] args) {

        CatOne catOne0 = new CatOne();
        CatOne catOne1 = new CatOne(6);
        CatOne catOne2 = new CatOne(6,5);

        System.out.println(catOne0.age + " " + catOne0.birthday);
    }

}
