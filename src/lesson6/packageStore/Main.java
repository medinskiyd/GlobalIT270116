package lesson6.packageStore;

/**
 * Created by dmitry on 13.02.16.
 */
public class Main {

    public static void main(String[] args) {

        Store littleStore = new Store();
        littleStore.setNameStore("Маленькое яблоко");

        System.out.println("Наш магазин называется - "
                + littleStore.getNameStore());

        Phone samsung = new Phone("Samsung S7", "black");
        Phone apple = new Phone("Iphone 94", "blue");
        Phone sony = new Phone("Sony ZZ", "white");

        littleStore.setPhone(samsung, 0);
        littleStore.setPhone(apple, 1);
        littleStore.setPhone(sony, 2);

        Phone[] sklad = littleStore.getSklad();

        for(int i = 0; i < sklad.length; i++){
            System.out.println("Название телефона из " + i +  " ячейки - "
                    + sklad[i].getNamePhone());
        }


    }

}
