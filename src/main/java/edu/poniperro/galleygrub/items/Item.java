package edu.poniperro.galleygrub.items;

import java.util.Objects;

public class Item implements Product{
    //atributos de paquete

    String name;
    Double price;
    String extra;
    
    //constructor
    public Item(String name, double price){
        this.name = name;
        this.price= price;
    }

    public Item(String name, double price, String extra){
        this.name = name;
        this.price= price;
        this.extra= extra;
    }

    //Métodos de la interfaz

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public Double price() {
        return this.price;
    }

    @Override
    public String extra() {
        return this.extra;
    }

    @Override
    public Boolean isRegular() {
        return null;
    }

    @Override
    public String toString() {
        if(this.extra() != null){
            return this.name() + " w/ " +this.extra()+ "...."
                    + String.format("%.2f", this.price())+ "$"
                    + " + "
                    + String.format("%.2f", Prices.getPriceExtra(extra()))+ "$";
        }
        else {
            return this.name() + "...."
                    + String.format("%.2f", this.price())+ "$";
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Item)) return false;
        Item item = (Item) obj;
        return name.equals(item.name) && price.equals(item.price) && extra.equals(item.extra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, extra);
    }
}
