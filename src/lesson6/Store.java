package lesson6;

/**
 * Created by dmitry on 13.02.16.
 */
public class Store {

    private String name;
    private int number = 6;
    private Phone mass[] = new Phone[number];


    public Store() {

    }

    public Store(String nameStore, int numberStore) {
        this.name = nameStore;
        this.number = numberStore;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setGoods(Phone phone, int num) {

        mass[num] = phone;
        System.out.println(phone.getName() + " добавлен в магазин!");
    }

    public Phone[] getMass() {
        return mass;
    }
}
