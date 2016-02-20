package lesson8.pack2;

/**
 * Created by dmitry on 20.02.16.
 */
abstract class Pet {

    String name;
    int age;
    boolean hungry;

    abstract void voice();
    void food() {
        hungry = false;
    }

}

