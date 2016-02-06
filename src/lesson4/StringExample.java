package lesson4;

/**
 * Created by dmitry on 05.02.16.
 */
public class StringExample {

    public static void main(String[] args) {

        //Пример 1/////////////////////////////////////////
        String ja = "Ja";
        String va = "va";
        String result = ja.concat(va); //эквивалентно result = ja + va;
        System.out.println("Наша строка: " + result);

        //Пример 2/////////////////////////////////////////
        int length =result.length();
        System.out.println("Размера строки: "+ length);

        //Пример 3/////////////////////////////////////////
        char letter = result.charAt(0); //Нумерация начиначется с 0
        System.out.println("Буква под номером 0: " + letter);

        //Пример 4/////////////////////////////////////////
        String a = result.substring(1, 4);
        System.out.println("Обрезаная строка: " + a);

        //Пример 5/////////////////////////////////////////
        String hello1 = "Hello";
        String h1 = hello1.toLowerCase();
        System.out.println(h1);
        String h2 = hello1.toUpperCase();
        System.out.println(h2);

        System.out.println();

        //Пример 6/////////////////////////////////////////
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Good-bye";
        String s4 = "HELLO";

        System.out.println(s1 + " равно " + s2 + " -> " + s1.equals(s2));
        System.out.println(s1 + " равно " + s3 + " -> " + s1.equals(s3));
        System.out.println(s1 + " равно " + s4 + " -> " + s1.equals(s4));



    }

}
