package lesson10.slide10;

/**
 * Created by dmitry on 25.02.16.
 */
class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(T o1, V o2) {	// Передать конструктору ссылки на объекты двух типов
        this.ob1 = o1;
        this.ob2 = o2;
    }

    void showTypes() {
        System.out.println("Тип T: " + ob1.getClass().getName());
        System.out.println("Тип V: " + ob2.getClass().getName());
    }

    T getob1() {        return ob1;    }

    V getob2() {        return ob2;    }

}
