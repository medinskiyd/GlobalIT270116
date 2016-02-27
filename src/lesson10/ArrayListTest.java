package lesson10;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dmitry on 27.02.16.
 */
public class ArrayListTest {
    ArrayList listTest = new ArrayList();
    Random generator = new Random();

    void addRandom() {
        listTest.add(new Integer(generator.nextInt()));
    }

    @Override
    public String toString() {
        return listTest.toString();
    }

    public static void main(String args[]) {
        ArrayListTest arrayListTest = new ArrayListTest();
        for(int i = 0; i < 100; i++ )
            arrayListTest.addRandom();

        System.out.println("Сто случайных чисел: "+arrayListTest.toString());

    }
}
