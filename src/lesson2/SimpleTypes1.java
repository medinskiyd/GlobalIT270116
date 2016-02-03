package lesson2;

/**
 * Created by dmitry on 29.01.16.
 */
public class SimpleTypes1 {

    public static void main(String[] args) {

        boolean deсision = true;
        byte b = 127;
        short s = 342;
        int i = 23432;
        long l = 234234;
        float f = 14.5f;
        double d = 5433332.33;

        char c = 'G';

        System.out.println("deсision = " + deсision);
        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.print("i = " + i + " нет перехода на новую строку ");
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("c = " + c);

        System.out.println(deсision + " " + b + " " + s + " " + i + " " + l +" " + f + " " + d + " " + c);

        b = (byte)(b+1);
        i = (int) (b + 5.2);

        System.out.println("b = " + b);
        System.out.println(i);
    }

}
