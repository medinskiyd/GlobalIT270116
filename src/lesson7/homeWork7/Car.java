package lesson7.homeWork7;

public class Car {
    private String color;
    private String type;
    private String model;
    private boolean isOn=false;
    private boolean isNotCorrupted=false;

    public Car() {

    }

    public Car (String color, String model) {
        this.color = color;
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
  
    public boolean isOn() {
        return isOn;
    }
    public void setOn(boolean on) {
        isOn = on;
    }

    public boolean getIsNotCorrupted() {
        return isNotCorrupted;
    }
    public void setIsNotCorrupted(boolean notCorrupted) {
        isNotCorrupted = notCorrupted;
    }

    public void turnOn() {
        if (isNotCorrupted  == true) {
            isOn=true;
            System.out.println("Транспортное средство "+ this.model + " " +this.color+" заведено!");
        } else {
            System.out.println("Транспортное средство "+ this.model + " " + this.color+" не заведено!");
            isOn=false;
        }
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Транспортное средство "+ this.model + this.type+this.color+" заглушено!");
    }

}

