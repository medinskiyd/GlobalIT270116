package lesson6.packageStore;

/**
 * Created by dmitry on 13.02.16.
 */
public class Store {

    private String nameStore;
    private int number = 3;

    Phone sklad[] = new Phone[number];

    public Store(){

    }

    public Store(String nameStore) {
        this.nameStore = nameStore;
    }

    public String getNameStore() {
        return nameStore;
    }

    public void setNameStore(String nameStore) {
        this.nameStore = nameStore;
    }

    public Phone[] getSklad() {
        return sklad;
    }

    public void setPhone(Phone phone, int indeks){

        sklad[indeks] = phone;
    }

}
