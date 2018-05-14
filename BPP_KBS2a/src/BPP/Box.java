package BPP;

import java.util.ArrayList;

/**
 *
 * @author Christiaan
 */
public class Box {
    
    private int size;
    
    private ArrayList<Product> productBoxArray = new ArrayList<>();

    public Box(int size) {
        this.size = size;
    }

    public boolean AddProduct(Product product) {
        if(product.getSize() < size){
        this.size = size - product.getSize();   
        productBoxArray.add(product);
        return true;
        }else{
            return true;
        }
    }
    
}
