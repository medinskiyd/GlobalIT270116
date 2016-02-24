package lesson9.hashcode;

/**
 * Created by dmitry on 23.02.16.
 */
public class Main {
    public static void main(String[] args) {
        Object object = new Object();
        int hCode;
        hCode = object.hashCode();
        System.out.println(hCode);
    }
}
