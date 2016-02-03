package lesson3;

/**
 * Created by dmitry on 03.02.16.
 */
public class Tern {

    public static void main(String[] args) {

        int largerNum;
        int lowNum = 9;
        int highNum = 27;

        largerNum = lowNum < highNum ? highNum : lowNum; // условие ? значение1 : значение2

        System.out.println(largerNum);

//        if (lowNum < highNum) {
//            largerNum = highNum;
//        } else {
//            largerNum = lowNum;
//        }


    }

}
