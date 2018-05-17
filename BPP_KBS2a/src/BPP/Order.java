package BPP;

import java.util.ArrayList;

public class Order {

    private ArrayList<Product> orderPackages;

    public Order() {
        orderPackages = new ArrayList<>();
    }

    public void addToOrder(Product p) {
        orderPackages.add(p);
    }

    public ArrayList<Product> getOrderPackages() {
        return orderPackages;
    }

    public String toString() {
        String orderList = "De volgende ID's zijn opgevraagd: \n";
        for (Product p : orderPackages) {
            orderList += p + "\n";
        }
        return orderList;
    }
}
