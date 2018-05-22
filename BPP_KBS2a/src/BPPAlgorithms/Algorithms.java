package BPPAlgorithms;

import static BPP.BPPInterface.boxSize;
import BPP.Box;
import BPP.OrderInterface;
import BPP.Product;
import static BPPAlgorithms.Sort.sortBoxesInOrderByFreeSpace;
import static BPPAlgorithms.Sort.sortProductsInOrderBySize;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Algorithms {

    public static boolean firstFit(OrderInterface order, Box A, Box B, Box C) {

        ArrayList<Product> sortedArray = sortProductsInOrderBySize(order.getOrderPackages(), true);
        ArrayList<Product> arrayA = new ArrayList<>();
        ArrayList<Product> arrayB = new ArrayList<>();
        ArrayList<Product> leftOverArray = new ArrayList<>();

        System.out.print("fill box A - ");
        sortedArray.forEach((x) -> {
            if (A.AddProduct(x, true)) {
                System.out.print("add ");
            } else {
                arrayA.add(x);
                System.out.print("denied ");
            }
        });
        System.out.println();
        System.out.print("fill box B - ");
        arrayA.forEach((x) -> {
            if (B.AddProduct(x, true)) {
                System.out.print("add ");
            } else {
                arrayB.add(x);
                System.out.print("denied ");
            }
        });
        System.out.println();
        System.out.print("fill box C - ");
        arrayB.forEach((x) -> {
            if (C.AddProduct(x, true)) {
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

        ArrayList<Box> boxArray = new ArrayList<>();
        boxArray.add(A);
        boxArray.add(B);
        boxArray.add(C);

        ArrayList<Box> sortedBoxArray = sortBoxesInOrderByFreeSpace(boxArray, true);

        ArrayList<Product> sortedArray = sortProductsInOrderBySize(order.getOrderPackages(), true);
        ArrayList<Product> arrayA = new ArrayList<>();
        ArrayList<Product> arrayB = new ArrayList<>();
        ArrayList<Product> leftOverArray = new ArrayList<>();

        sortedBoxArray.forEach((a) -> {
            System.out.println(a.getFreeSpace());
        });

        System.out.print("fill box - ");
        sortedArray.forEach((x) -> {
            if (sortedBoxArray.get(0).AddProduct(x, true)) {
                System.out.print("add ");
            } else {
                arrayA.add(x);
                System.out.print("denied ");
            }
        });
        System.out.println();
        System.out.print("fill box - ");
        arrayA.forEach((x) -> {
            if (sortedBoxArray.get(1).AddProduct(x, true)) {
                System.out.print("add ");
            } else {
                arrayB.add(x);
                System.out.print("denied ");
            }
        });
        System.out.println();
        System.out.print("fill box - ");
        arrayB.forEach((x) -> {
            if (sortedBoxArray.get(2).AddProduct(x, true)) {
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

    public static boolean BinCompletion(OrderInterface order, Box A, Box B, Box C) {
        return false;
    }

    public static boolean OwnMethod(OrderInterface order, Box A, Box B, Box C) {

        int sizeCounter = 0;
        int lowerBound = 0;
        int box = 0;
        int random;
        int counter = 1;
        int orderSize = 0;

        sizeCounter = order.getOrderPackages().stream().map((a) -> a.getSize()).reduce(sizeCounter, Integer::sum);

        if (sizeCounter % boxSize > 0) {
            lowerBound = (sizeCounter / boxSize) + 1;
        } else {
            lowerBound = (sizeCounter / boxSize);
        }

        System.out.println("lowerBound - " + lowerBound);

        while (true) {

            if (lowerBound > 3) {
                return false;
            }
            if (counter <= 10) {
                ArrayList<Product> orderArray = order.getOrderPackages();
                
                while (box <= 3 && orderArray.size() > 0) {
                    if (box == 0) {
                        System.out.println("Round:" + counter);
                        orderSize = orderArray.size();
                        box++;
                    }
                    if (box == 1) {
                        System.out.print("fill box A - ");
                        random = ThreadLocalRandom.current().nextInt(0, orderSize);
                        if (A.AddProduct(orderArray.get(random), false)) {
                            System.out.print("add " + orderArray.get(random));
                            orderArray.remove(random);
                            orderSize--;
                        } else {
                            System.out.print("denied ");
                            box++;
                        }
                    }

                    if (box == 2) {
                        System.out.println();
                        System.out.print("fill box B - ");
                        random = ThreadLocalRandom.current().nextInt(0, orderSize);
                        if (B.AddProduct(orderArray.get(random), false)) {
                            System.out.print("add " + orderArray.get(random));
                            orderArray.remove(random);
                            orderSize--;
                        } else {
                            System.out.print("denied ");
                            box++;
                        }
                    }

                    if (box == 3) {
                        System.out.println();
                        System.out.print("fill box C - ");
                        random = ThreadLocalRandom.current().nextInt(0, orderSize);
                        if (C.AddProduct(orderArray.get(random), false)) {
                            System.out.print("add " + orderArray.get(random));
                            orderArray.remove(random);
                            orderSize--;
                        } else {
                            System.out.print("denied ");
                            box++;
                        }
                    }
                }
                System.out.println();
                System.out.println("boxes used " + box);
                if (box <= lowerBound && box != 0) {
                    System.out.println("succes");
                    return true;
                } else {
                    System.out.println("fail");
                    box = 0;
                    counter++;
                }
            }
            if (counter >= 10) {
                lowerBound++;
                counter = 0;
            }
        }
    }

}
