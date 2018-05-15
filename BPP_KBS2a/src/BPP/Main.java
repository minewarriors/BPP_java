package BPP;

import static BPP.BPPInterface.boxSize;
import static BPPAlgorithms.Algorithms.firstFit;

public class Main {

    public static void main(String[] args) {

        // BPPMainScreen headscreen = new BPPMainScreen();
        RandomOrder b2 = new RandomOrder();
        b2.print();

        Box A = new Box(boxSize);
        Box B = new Box(boxSize);
        Box C = new Box(boxSize);

        if (firstFit(b2, A, B, C)) {
            System.out.println("---- Succes ----");
        } else {
            System.out.println("---- Te weinig ruimte ----");
        }

        System.out.println("box A");
        
        A.getProductBoxArray().forEach((a) -> {
            System.out.println(a);
        });

        System.out.println("box B");
        
        B.getProductBoxArray().forEach((a) -> {
            System.out.println(a);
        });

        System.out.println("box C");
        
        C.getProductBoxArray().forEach((a) -> {
            System.out.println(a);
        });
    }
}
