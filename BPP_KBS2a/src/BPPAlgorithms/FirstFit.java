package BPPAlgorithms;

import BPP.Box;
import BPP.OrderInterface;
import BPP.Product;
import java.awt.Color;
import static BPPAlgorithms.Sort.sortProductsInOrderBySize;
import java.util.ArrayList;

public class FirstFit implements BPPAlgorithmInterface {

    private OrderInterface order;
    private ArrayList<Product> productArray = new ArrayList<>();

    public FirstFit(OrderInterface order) {
        this.order = order;
        productArray = order.getProductArray();
    }

    @Override
    public ArrayList<Box> calculate() {

        ArrayList<Product> sortedArray = sortProductsInOrderBySize(productArray, true);
        ArrayList<Product> arrayA = new ArrayList<>();
        ArrayList<Product> arrayB = new ArrayList<>();
        ArrayList<Product> leftOverArray = new ArrayList<>();
        ArrayList<Box> boxArray = new ArrayList<>();


        Box A = new Box("A", boxSize);
        Box B = new Box("B", boxSize);
        Box C = new Box("C", boxSize);

        System.out.print("fill box A - ");
        sortedArray.forEach((x) -> {
            if (A.AddProduct(x)) {
                System.out.print("add ");
            } else {
                arrayA.add(x);
                System.out.print("denied ");
            }
        });
        System.out.println();
        System.out.print("fill box B - ");
        arrayA.forEach((x) -> {
            if (B.AddProduct(x)) {
                System.out.print("add ");
            } else {
                arrayB.add(x);
                System.out.print("denied ");
            }
        });
        System.out.println();
        System.out.print("fill box C - ");
        arrayB.forEach((x) -> {
            if (C.AddProduct(x)) {
                System.out.print("add ");
            } else {
                leftOverArray.add(x);
                System.out.print("denied ");
            }
        });
        System.out.println();

        if (leftOverArray.size() <= 0) {
            if (A.getProductBoxArray().size() > 0) {
                boxArray.add(A);
            }
            if (B.getProductBoxArray().size() > 0) {
                boxArray.add(B);
            }
            if (C.getProductBoxArray().size() > 0) {
                boxArray.add(C);
            }
        }

        leftOverArray.forEach((x) -> {
            System.out.println("id:" + x.getProductId() + " X:" + x.getX() + " Y:" + x.getY() + " C:" + x.getColor() + " S:" + x.getSize());
        });
        return boxArray;

    }
}
