package lesson9.hashcodePlusEquals;

/**
 * Created by dmitry on 23.02.16.
 */
public class DemoBlackBox {
    public static void main(String[] args) {
        BlackBox object1 = new BlackBox(5, 10);
        BlackBox object2 = new BlackBox(5, 10);

        // тут сравниваются не объекты, а ссылки
        System.out.println(object1.equals(object2));
        System.out.println(object1.hashCode() == object2.hashCode());

        BlackBoxCorect object3 = new BlackBoxCorect(5, 10);
        BlackBoxCorect object4 = new BlackBoxCorect(5, 10);

        // тут сравниваются конкретно объекты, так как мы
        // переопределили hashcode и equals.
        System.out.println(object3.equals(object4));
        System.out.println(object3.hashCode() == object4.hashCode());


    }
}
