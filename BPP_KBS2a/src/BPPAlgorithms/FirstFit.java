package BPPAlgorithms;

import BPP.Box;
import BPP.OrderInterface;
import BPP.Product;
import java.awt.Color;
import static BPPAlgorithms.Sort.sortProductsInOrderBySize;
import java.util.ArrayList;

public class FirstFit implements BPPAlgorithmInterface {

    private OrderInterface order;
    private ArrayList<Box> BoxArray = new ArrayList<>();
    ArrayList<Product> productArray = new ArrayList<>();

    public FirstFit(OrderInterface order) {
        this.order = order;
        productArray = order.getProductArray();
        Box A = new Box(boxSize);
        Box B = new Box(boxSize);
        Box C = new Box(boxSize);
    }

    @Override
    public void calculate() {
 
        sortProductsInOrderBySize(productArray, true);
        
            sortProductsInOrderBySize(productArray, true).forEach((x) -> {
            System.out.println("id:" + x.getProductId() + " X:" + x.getX() + " Y:" + x.getY() + " C:" + x.getColor() + " S:" + x.getSize());
             });
            
                        sortProductsInOrderBySize(productArray, false).forEach((x) -> {
            System.out.println("id:" + x.getProductId() + " X:" + x.getX() + " Y:" + x.getY() + " C:" + x.getColor() + " S:" + x.getSize());
             });
        
    }

    @Override
    public void printSolution() {
        System.out.print("test");
    }
}
