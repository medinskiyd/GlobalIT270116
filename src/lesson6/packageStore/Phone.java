package lesson6.packageStore;

/**
 * Created by dmitry on 13.02.16.
 */
public class Phone {

    private String namePhone;
    private String color;

    public Phone() {

    }

    public Phone(String namePhone, String color) {
        this.namePhone = namePhone;
        this.color = color;
    }

    public String getNamePhone() {
        return namePhone;
    }

    public void setNamePhone(String namePhone) {
        this.namePhone = namePhone;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
