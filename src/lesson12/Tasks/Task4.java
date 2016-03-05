package lesson12.Tasks;

import java.util.*;

/**
 * Как одним вызовом из List получить List со всеми элементами, кроме первых и последних 3-х?
 */
public class Task4 {

    public static void main(String[] args) {

        List<Integer> sourceList = new ArrayList<>(Arrays.asList
                (1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Integer> subList = sourceList.subList(3, sourceList.size() - 3);
        // 4, 5, 6

        System.out.println(subList.toString());
    }

}
