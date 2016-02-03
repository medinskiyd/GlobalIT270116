package lesson3;

/**
 * Created by dmitry on 03.02.16.
 */
class Return {
    public static void main(String args[]) {
        boolean t = true;
        System.out.println("До выполнения возврата.");
        if (t) { return; // возврат к вызывающему объекту
        }
        System.out.println("Этот оператор выполняться не будет.");
    }
}
