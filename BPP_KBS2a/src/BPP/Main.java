package BPP;

import BPPAlgorithms.FirstFit;
import static java.awt.Color.*;

public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD

        Product A1 = new Product(1, 2, 3, BLUE, 10);
        Product A2 = new Product(GREEN, 10);
        // System.out.println(A1);
        // System.out.println(A2);

        BPPMainScreen headscreen = new BPPMainScreen();

        RandomOrder b2 = new RandomOrder();
        b2.print();

        System.out.println(b2.getOrderSize());
        System.out.println(b2.getProductSize(1));
        System.out.println(b2.getProductColor(1));
        System.out.println(b2.getProductId(1));
        System.out.println(b2.getProductX(1));
        System.out.println(b2.getProductY(1));

        FirstFit test = new FirstFit(b2);
        test.printSolution();
=======
         
           //BPPMainScreen headscreen = new BPPMainScreen();
           
           RandomOrder b2 = new RandomOrder();
           b2.print();
           

           FirstFit test = new FirstFit(b2);
         //  test.printSolution();
           test.calculate();
>>>>>>> 4e101bf85f76234c2898e52874c1240e1b9cbeff
    }

}
