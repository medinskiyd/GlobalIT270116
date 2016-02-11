package lesson5.example2Slide13;

/**
 * Created by dmitry on 09.02.16.
 */

class Smth {

    void doSmth() { //Метод создан первоначально
        // параметры отсутствуют
    }

    void doSmth(int count) { //Перегруженный метод
        // с одним параметром типа int.
        // используется один параметр типа int
    }

    void doSmth(int count, int pause)  { //Перегруженный метод с
        // двумя параметрами.
        // используются два параметра типа int
    }

    long doSmth(long time) {  //Перегруженный метод с одним параметром
        // типа long.
        // используется один параметр типа long
        return time;
    }

    void doSmth(Object... arg)  { //Перегруженный метод с переменным
        // числом параметров.
        // используются два параметра типа int
    }

}