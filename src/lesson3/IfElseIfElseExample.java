package lesson3;

/**
 * Created by dmitry on 03.02.16.
 */
public class IfElseIfElseExample {

    public static void main(String[] args) {
        boolean condition1 = false;
        boolean condition2 = true;
        boolean condition3 = true;

        if (condition1) {
            System.out.println("instruction_1");
            System.out.println("instruction_2");
        } else if (condition2) {
            System.out.println("instruction_3");
            System.out.println("instruction_4");
        } else if (condition3) {
            System.out.println("instruction_5");
            System.out.println("instruction_6");
        }

    }

}
