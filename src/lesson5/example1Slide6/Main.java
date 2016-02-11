package lesson5.example1Slide6;

/**
 * Created by dmitry on 09.02.16.
 */
public class Main {

    public static void main(String[] args) {

        Box box = new Box(); //Объявляем переменную типа Box
                            // и резервируем память под объект.

        Box bigBox = new Box();//Создаем новый объект нашего класса Box.


        box.width = 10; //обращаемся к объекту box и присваиваем
                        // его переменной width значение 10.
        box.height = 20;
        box.depth = 5;


        box.closeBox(); //Этот метод ничего не делает,
                        // так как тело медота пустое.

        String str = box.openBox(); // Метод вернет строку "Коробка открыта"
        System.out.println(str);

        int square1 = box.getSquare(4,5,4);
        System.out.println(square1);

        int square = box.getSquareBox();
        System.out.println("Площадь коробки = " + square);


    }

}
