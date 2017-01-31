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

        ArrayList carList = new ArrayList<Car>();
        carList.add( new Car("peugeot", Color.GREEN, 1000F));
        carList.add( new Car("volkswagen", Color.BLUE, 1500F));
        carList.add( new Car("renault", Color.RED, 2000F));

        garage.addCar( carList);

        System.out.println(garage);
    }
}
