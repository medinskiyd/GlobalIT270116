package lesson4;

/**
 * Created by dmitry on 06.02.16.
 */
public class StringBuffEx {

    public static void main(String[] args) {

        StringBuffer output = new StringBuffer(110); //Размер строки = 100

        output.append("Some text");
        for(int i =0; i<5; i++) {
            output.append(i);
        }

        System.out.println(output.toString());
    }

}
