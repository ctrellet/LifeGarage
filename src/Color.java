/**
 * Created by christophe on 30/01/17.
 */
public enum Color {
    RED("Red"),
    GREEN("Green"),
    BLUE("Blue");

    private String name = "";

    //Constructeur
    Color(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }
}
