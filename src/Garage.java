/**
 * Created by christophe on 30/01/17.
 */

import java.awt.*;
import java.util.ArrayList;

public class Garage {

    private String name;
    private ArrayList vehicles;

    public Garage(String name) {
        this.name = name;
        this.vehicles = new ArrayList<>();
    }

    // Ajout d'une voiture unique
    public void addCar(String brand, Color color, Float price){
        //Car car = new Car(brand, color, price);
        this.vehicles.add( new Car(brand, color, price) );
    }
    // Ajout de plusieurs voitures (collection)
    public void addCar(ArrayList<Car> listCars){
        this.vehicles.addAll(listCars);
    }


    @Override
    public String toString() {
        return "\nGarage "+this.name+" :"+this.vehicles.toString();
    }
}
