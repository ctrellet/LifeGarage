/**
 * Created by christophe on 30/01/17.
 */
public class Car extends Vehicle {

    public Car(String brand, Color color, Float price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public Float getPriceWithTax(){
        return (float) this.price + 2F;
    }
}
