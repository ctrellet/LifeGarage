import javax.swing.*;

/**
 * Created by christophe on 30/01/17.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("\n==========================================================");
        System.out.println("       LifeGarage project ");
        System.out.println("==========================================================");

        Garage garage = new Garage("MY garage");

        garage.addVehicle("renault", Color.RED, 999.9F);

        System.out.println(garage);
    }
}
