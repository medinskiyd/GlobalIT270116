package lesson12;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by dmitry on 03.03.16.
 */
public class TestHashSet {

    public static void main(String[] args) {

        HashSet<String> myHashSet = new HashSet<>();
        myHashSet.add("a1");
        myHashSet.add("b2");
        myHashSet.add("c3");
        myHashSet.add("d4");
        boolean bbb = myHashSet.add("b2"); //--\
        myHashSet.add("c3"); //--->эти элементы уже есть в коллекции
        myHashSet.add("a1"); //--/

        Iterator<String> itr = myHashSet.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next().toString() + ", ");
        }
        System.out.println(bbb);


        System.out.println("Размер коллекции: "+ myHashSet.size());

    }

}
