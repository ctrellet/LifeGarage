/**
 * Created by christophe on 30/01/17.
 */
public enum Color {
    RED(    "Red"   ,"FFFF00"),
    GREEN(  "Green" ,"008000"),
    BLUE(   "Blue"  ,"0000FF");

    private String name = "";
    private String hexCode = "000000";

    //Constructeur
    Color(String name, String hexCode){
        this.name = name;
        this.hexCode = hexCode;
    }

    public String toString(){
        return name;
    }

    public String getHexCode() {
        return "#"+hexCode;
    }
}
