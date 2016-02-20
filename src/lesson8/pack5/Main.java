package lesson8.pack5;

/**
 * Created by dmitry on 20.02.16.
 */
public class Main {

    public static void main(String[] args) {

        CargoAuto truck = new Truck();
        truck.transportCargo();

        CargoAuto pickupCargo = new Pickup();
        pickupCargo.transportCargo();
        //pickupCargo.transportPassangers(); - так мы написать не можем.


        PassangersAuto sedan = new Sedan();
        sedan.transportPassangers();

        PassangersAuto pickupPass = new Pickup();
        pickupPass.transportPassangers();
        //pickupPass.transportCargo(); - так мы написать не можем.


        Pickup fullPickup = new Pickup();
        fullPickup.transportCargo();
        fullPickup.transportPassangers();

    }

}
