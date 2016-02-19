package lesson7.less7;

/**
 * Created by dmitry on 17.02.16.
 */
public class Main {

    public static void main(String[] args) {

        MySuperClass parent = new MySuperClass();
        MyChildClass child = new MyChildClass();

        parent.setAge(60);
        child.setAge(15);

        System.out.println("Child age = " + child.getAge());
        System.out.println("Parent age = " + parent.getAge());

        System.out.println(MySuperClass.name);
        System.out.println();


    }

}
