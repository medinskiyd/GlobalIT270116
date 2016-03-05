
package lesson7.homeWork7;

/**
 * Created by ���� on 18.02.2016.
 */
public class Autopark {

    static Car autopark[] = new Car[5];

    static {
        Car bmw = new Car("black", "BMW");
        autopark[0] = bmw;
        bmw.setIsNotCorrupted(true);
        Car lada = new Car("white", "Lada");
        autopark[1] = lada;
        lada.setIsNotCorrupted(true);
        Bus audi = new Bus("red", "Audi");
        autopark[2] = audi;
        audi.setIsNotCorrupted(true);
        Bus bogdan = new Bus("blue", "Bogdan");
        autopark[3] = bogdan;
        bogdan.setIsNotCorrupted(false);
        BigCar volvo = new BigCar("yellow", "Volvo");
        autopark[4] = volvo;
        volvo.setIsNotCorrupted(true);
    }

    public static boolean workingAbility() {
        boolean allOn = false;
        for (int i = 0; i < autopark.length; i++) {
            autopark[i].turnOn(); //завели машину
            if (autopark[i].isOn() == true) { //если завелась
                allOn = true;
            } else { //если не завелась
                allOn = false;
                break;
            }
        }

        if (allOn == true) {
            System.out.println("Все ТС исправны и готовы к работе!");
        } else {
            System.out.println("Есть неисправные ТС, требуется ремонт!");
        }

        return allOn;
    }

    public static void turnOffAll() {

        for (int i = 0; i < autopark.length; i++) {
            autopark[i].turnOff();//заглушили машину
        }

    }
}