import java.awt.*;
import java.util.Collection;
import java.util.ArrayList;

/**
 * Created by christophe on 30/01/17.
 */
public class Car {

    protected String brand;
    protected Color color;
    protected Float price;

    public Car(String brand, Color color, Float price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "brand='" + brand + '\'' +
                ", color=" + color +
                ", price=" + price +
                '}';
    }
}
