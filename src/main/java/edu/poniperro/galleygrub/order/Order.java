package edu.poniperro.galleygrub.order;

import edu.poniperro.galleygrub.items.Item;

import java.util.ArrayList;
import java.util.List;

public class Order implements Comanda {
    //atributes
    private Double total;
    private List<Item> itemList = new ArrayList();

    //constructor
    public Order(){}

    //métodos implementados de Comanda

    @Override
    public void addItem(String name, double price) {
        this.itemList.add(new Item(name, price));
    }

    @Override
    public void addItem(String name, double price, String extra) {
        this.itemList.add(new Item(name,price, extra));

    }

    @Override
    public Integer size() {
        return null;
    }

    @Override
    public List<Item> itemList() {
        return this.itemList;
    }

    @Override
    public Double getTotal() {
        Double total = 0.0d;
        for (Item item : itemList()){
            total += item.price();
        }
        return total;
    }


    @Override
    public void updateTotal(Double price) {

    }

    @Override
    public void display() {
        for (Item item: itemList()){
            System.out.print("\t" + item.toString() + "\n");
        }
    }

    //método de clase
    private void itemDisplay(Item item){}
}
