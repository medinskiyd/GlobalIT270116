package lesson8.pack5;

/**
 * Created by dmitry on 20.02.16.
 */
class Pickup implements CargoAuto, PassangersAuto {

    public void transportCargo() {
        System.out.println("Везу груз");
    }
    public void transportPassangers() {
        System.out.println("Везу пассажиров");
    }
}
