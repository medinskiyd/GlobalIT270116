package lesson5.example4Slide17;

/**
 * Created by dmitry on 09.02.16.
 */
public class Main {


    public static void main(String[] args) {

        Cat vaska = new Cat();

        //Например пишем наш код и забываем наш vaska объект класса Cat
        // или Dog.
        //Для того что бы узнать от какого класса создан наш обьект
        // используем instanceOf.

        boolean yesCat = vaska instanceof Cat;

        System.out.println("Правда ли что vaska создан от " +
                                "класса Cat = " + yesCat);





    }
}
