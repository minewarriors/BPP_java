
package BPP;

import java.util.ArrayList;

/**
 *
 * @author Christiaan
 */
public interface OrderInterface {

    int getOrderSize();

    int getProductSize(int number);
    
    Product getProduct(int number);

    String getProductColor(int number);

    int getProductId(int number);

    int getProductX(int number);

    int getProductY(int number);
    
    void print();
    
    ArrayList<Product> getProductArray();
   
}
