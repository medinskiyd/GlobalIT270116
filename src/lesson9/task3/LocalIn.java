package lesson9.task3;

/**
 * Created by dmitry on 23.02.16.
 */
public class LocalIn {

    public static void doSomething()
        {
            int k = 10;

            class A
            {
                void print() { System.out.println(k); }
            }

            new A().print();
        }

//    {
//        new A().print(); - так мы сделать не можем, так как класс
//                  А является локальным для метода doSomething()
//    }

    public static void main(String... arg) {

            doSomething();
            //new A().print(); - в данном месте мы не можем
        // обратится в классу А, так как он локальный.
            //К классу А есть доступ только в методе doSomething().
        }

}
