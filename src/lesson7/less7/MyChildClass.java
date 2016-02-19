package lesson7.less7;

/**
 * Created by dmitry on 17.02.16.
 */
public class MyChildClass extends MySuperClass {

    static String name = "Child";

    public void read (){
        System.out.println("Я читаю, и я ребенок ");
        System.out.println(super.name);
    }

}


