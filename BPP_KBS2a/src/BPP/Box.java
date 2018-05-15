package BPP;

import java.util.ArrayList;

/**
 *
 * @author Christiaan
 */
public class Box {

    private int freeSpace;

    private String name;

    private ArrayList<Product> productBoxArray = new ArrayList<>();

    public Box(String name, int size) {
        this.freeSpace = size;
        this.name = name;
    }

    public boolean AddProduct(Product product) {
        if (product.getSize() <= freeSpace) {
            this.freeSpace = freeSpace - product.getSize();
            productBoxArray.add(product);
            return true;
        } else {
            return false;
        }
    }

    public int getFreeSpace() {
        return freeSpace;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Product> getProductBoxArray() {
        return productBoxArray;
    }

    public void print() { //print de gegevens in de array
        productBoxArray.forEach((x) -> {
            System.out.println(x);
        });
    }

}
