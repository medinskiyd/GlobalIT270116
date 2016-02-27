package lesson10.slide4;

/**
 * Created by dmitry on 25.02.16.
 */
//тип Т - это шаблон , вместо которого будет подставлен конкретный класс.

class Gen<T> { 		// объявили класс *
    T ob; 		// объявление объекта типа T **

    Gen(T o) { 		// Передать конструктору ссылку на объект типа T ***
        ob = o;
    }

    T getob() {		// getter
        return ob;
    }

    // Показать тип T
    void showType() {
        System.out.println("Тип T: " +
                ob.getClass().getName());
    }
}
