package edu.poniperro.galleygrub.items;

import java.util.HashMap;
import java.util.Map;

public class Prices {
    //Atributes
    private static HashMap<String, Double> extras = new HashMap<String, Double>();

    //Constructor:
     public Prices(){

     }

    //Methods
    public static void init_prices(){
        extras.put("cheese", 0.25);
        extras.put("sauce", 0.50);
        extras.put("medium", 0.25);
        extras.put("large", 0.50);
    }
    //este método devuelve el valor de la clave que escribiremos en nameExtra
    public static Double getPriceExtra(String nameExtra){
        return extras.get(nameExtra);
    }


    public static void display(){
        for (Map.Entry<String, Double> entry : extras.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue().toString() + " $");
        }
    }
}
