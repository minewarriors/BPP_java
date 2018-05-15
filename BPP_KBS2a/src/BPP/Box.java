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
        if(product.getSize() <= freeSpace){
        this.freeSpace = freeSpace - product.getSize();   
        productBoxArray.add(product);
        return true;
        }else{
        return false;
        }
    }
    
}
