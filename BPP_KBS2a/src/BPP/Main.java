package BPP;

import BPPAlgorithms.FirstFit;
import static java.awt.Color.*;

public class Main {

    public static void main(String[] args) {

        // BPPMainScreen headscreen = new BPPMainScreen();
        RandomOrder b2 = new RandomOrder();
        b2.print();
        System.out.println("");

        FirstFit test = new FirstFit(b2);

        test.calculate();


        
        test.calculate().forEach((a) -> {
                System.out.println("box " + a.getName());
                a.print();
        });

    }

}
