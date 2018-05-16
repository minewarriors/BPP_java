package BPPAlgorithms;

import BPP.Box;
import BPP.OrderInterface;
import BPP.Product;
import static BPPAlgorithms.Sort.sortBoxesInOrderByFreeSpace;
import static BPPAlgorithms.Sort.sortProductsInOrderBySize;
import java.util.ArrayList;

public class Algorithms {

    public static boolean firstFit(OrderInterface order, Box A, Box B, Box C) {

        ArrayList<Product> sortedArray = sortProductsInOrderBySize(order.getProductArray(), true);
        ArrayList<Product> arrayA = new ArrayList<>();
        ArrayList<Product> arrayB = new ArrayList<>();
        ArrayList<Product> leftOverArray = new ArrayList<>();

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

        leftOverArray.forEach((x) -> {
            System.out.println("Let op! --- " + x + " --- Kan niet worden toegevoegd. Want er zijn te weinig kisten");
        });
        return leftOverArray.size() <= 0;
    }

    public static boolean BestFitDecreasing(OrderInterface order, Box A, Box B, Box C) {
        
        ArrayList<Product> sortedArray = sortProductsInOrderBySize(order.getProductArray(), true);
        ArrayList<Box> boxArray = new ArrayList<>();
        boxArray.add(A);
        boxArray.add(B);
        boxArray.add(C);
        ArrayList<Box> sortedBoxArray = sortBoxesInOrderByFreeSpace(boxArray, true);
        
        boxArray.forEach((a) -> {
           System.out.println(a.getFreeSpace());
        });
        
        System.out.println("--");


        sortedBoxArray.forEach((a) -> {
             System.out.println(a.getFreeSpace());
        });

        return false;
    }

    public static boolean BinCompletion(OrderInterface order, Box A, Box B, Box C) {
        return false;
    }

    public static boolean OwnMethod(OrderInterface order, Box A, Box B, Box C) {
        return false;
    }
}
