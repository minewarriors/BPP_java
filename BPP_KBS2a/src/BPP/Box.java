package BPP;

import java.util.ArrayList;

/**
 *
 * @author Christiaan
 */
public class Box {

    private int freeSpace;

    private ArrayList<Product> productBoxArray = new ArrayList<>();

    public Box(int size) {
        this.freeSpace = size;
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

    public ArrayList<Product> getProductBoxArray() {
        return productBoxArray;
    }

    public void print() { //print de gegevens in de array
        productBoxArray.forEach((x) -> {
            System.out.println(x);
        });
    }

    public void setFreeSpace(int freeSpace) {
        this.freeSpace = freeSpace;
    }

    public void setProductBoxArray(ArrayList<Product> productBoxArray) {
        this.productBoxArray = productBoxArray;
    }
    

}
