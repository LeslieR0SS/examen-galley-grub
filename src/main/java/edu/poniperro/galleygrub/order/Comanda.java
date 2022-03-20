package edu.poniperro.galleygrub.order;

import edu.poniperro.galleygrub.items.Item;

import java.util.List;

public interface Comanda {
    public void addItem(String name, double price);
    public void addItem(String name, double prce, String extra);
    public Integer size();
    public List<Item> itemList();
    public Double getTotal();
    public void updateTotal(Double price);
    public void display();

}
