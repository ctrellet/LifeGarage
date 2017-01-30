/**
 * Created by christophe on 30/01/17.
 */

import java.awt.*;
import java.util.ArrayList;

public class Garage {

    private String name;
    private ArrayList<Car> vehicles;

    public Garage(String name) {
        this.name = name;
        this.vehicles = new ArrayList<Car>();
    }

    // Ajout d'un véhicule unique
    public void addVehicle(String brand, Color color, Float price){
        //Car car = new Car(brand, color, price);
        this.vehicles.add( new Car(brand, color, price) );
    }

    @Override
    public String toString() {
        return "\nGarage "+this.name+" :"+this.vehicles.toString();
    }
}
