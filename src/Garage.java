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
        this.vehicles.add( new Car(brand, color, price) );
    }
/*    // Ajout de plusieurs voitures (collection)
    public void addCar(ArrayList<Car> listCars){
        this.vehicles.addAll(listCars);
    }

    // Ajout d'une moto unique
    public void addBike(String brand, Color color, Float price){
        this.vehicles.add( new Bike( brand, color, price) );
    }
    // Ajout de plusieurs motos (collection)
    public void addBike(ArrayList<Bike> listBikes){
        this.vehicles.addAll(listBikes);
    }
*/
    // VERSION OPTIMISEE : Une seule méthode, quelque soit le type de véhicule
    // Ajout de plusieurs véhicules (collection)
    public void addVehicle(ArrayList listVehicle){
        this.vehicles.addAll(listVehicle);
    }


    @Override
    public String toString() {
        return "\nGarage "+this.name+" :"+this.vehicles.toString();
    }
}
