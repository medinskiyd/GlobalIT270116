package lesson6;

import java.util.Arrays;

/**
 * Created by dmitry on 13.02.16.
 */
public class Main {

    public static void main(String[] args) {

        Store store = new Store(); // Создали обїект магазин.
        store.setName("GlobalIT");
        store.setNumber(6);

        System.out.println("Название магазина: " + store.getName());
        System.out.println("Количество товаров: " + store.getNumber());

        // Создали обьекты телефонов.
        Phone iphone = new Phone();
        iphone.setName("IPhone 6");
        store.setGoods(iphone,0);

        Phone lenovo = new Phone();
        lenovo.setName("Lenovo 435");
        store.setGoods(lenovo,1);
        Phone sony = new Phone();
        sony.setName("Sony Xperia ZL");
        store.setGoods(sony,2);
        Phone nokia = new Phone();
        nokia.setName("Nokia 1100");
        store.setGoods(nokia,3);
        Phone samsung = new Phone();
        samsung.setName("Samsung S7");
        store.setGoods(samsung,4);
        Phone xiaomi = new Phone();
        xiaomi.setName("Xiaomi Pro5");
        store.setGoods(xiaomi,5);

        Phone sklad[] = store.getMass();

        System.out.println("Список телефонов: ");
        for(int i = 0; i < sklad.length; i++) {
            System.out.println(sklad[i].getName());
        }

    }

}
