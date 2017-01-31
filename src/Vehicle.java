/**
 * Created by christophe on 31/01/17.
 */
abstract class Vehicle {

    protected String brand;
    protected Color color;
    protected Float price;

    protected abstract Float getPriceWithTax();

    @Override
    public String toString() {
        return "\n"+this.getClass()+"{" +
                "brand='" + brand + '\'' +
                ", color=" + color +
                ", taxed price=" + getPriceWithTax() +
                '}';
    }

}
