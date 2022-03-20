package edu.poniperro.galleygrub.receipt;

import edu.poniperro.galleygrub.order.Comanda;

public class Receipt implements Ticket {
    //atributos
    private Double total;
    private Comanda comanda;

    //constructor
    public Receipt(Comanda comanda){
        this.comanda = comanda;
    }

    //metodos implementados de Ticket
    @Override
    public Comanda getOrder() {
        return null;
    }
/**
    @Override
    public void setChain(Extra extra) {

    }

    @Override
    public Extra getChain() {
        return null;
    }
**/
    @Override
    public Double total() {
        return comanda.getTotal();
    }

    @Override
    public void sumExtrasCharge() {

    }

    @Override
    public void print() {
        comanda.display();
        System.out.println("\tTOTAL --------> " + total().toString() + "$");
    }
}
