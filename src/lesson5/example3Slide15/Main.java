package lesson5.example3Slide15;

/**
 * Created by dmitry on 09.02.16.
 */
public class Main {

    public static void main(String[] args) {

        BlackCat barsikCat = new BlackCat();
        BlackCat murkaCat = new BlackCat();

        barsikCat.name = "Барсик";
        //barsikCat.color = "Белый"; - недопустимая операция, так как
        // переменная color имеет ключевое слово final.
        String color = barsikCat.color;
        System.out.println(barsikCat.name + " имеет " + color + " цвет");


        murkaCat.name = "Мурка";
        //murkaCat.color = "Серый";
        System.out.println(murkaCat.name + " имеет " + murkaCat.color + " цвет");

    }

}
