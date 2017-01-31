import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by christophe on 30/01/17.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("\n==========================================================");
        System.out.println("       LifeGarage project ");
        System.out.println("==========================================================");

        Garage garage = new Garage("MY garage");

        garage.addCar("renault", Color.RED, 999.9F);

        System.out.println(garage);

        ArrayList carList = new ArrayList();
        carList.add( new Car("peugeot"      , Color.GREEN   , 1000F));
        carList.add( new Car("volkswagen"   , Color.BLUE    , 1500F));
        carList.add( new Car("renault"      , Color.RED     , 2000F));

        //garage.addCar( carList);        // Version standard
        garage.addVehicle( carList);    // Version optimisée

        System.out.println(garage);

        ArrayList bikeList = new ArrayList();
        bikeList.add( new Bike("harley"      , Color.RED     ,  800F));
        bikeList.add( new Bike("ducati"      , Color.BLUE    , 1000F));
        bikeList.add( new Bike("bmw"         , Color.GREEN   , 1999.9F));

        //garage.addBike( bikeList);      // Version standard
        garage.addVehicle( bikeList);    // Version optimisée

        System.out.println(garage);
    }
}
