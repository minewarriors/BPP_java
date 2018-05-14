
package BPP;

/**
 *
 * @author Christiaan
 */
public interface OrderInterface {

    int getOrderSize();

    int getProductSize(int number);

    String getProductColor(int number);

    int getProductId(int number);

    int getProductX(int number);

    int getProductY(int number);
    
    void print();
   
}
