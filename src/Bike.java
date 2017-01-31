/**
 * Created by christophe on 31/01/17.
 */
public class Bike extends Vehicle {

    public Bike(String brand, Color color, Float price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    protected Float getPriceWithTax(){
        return (float) this.price + 1F;
    }
}

