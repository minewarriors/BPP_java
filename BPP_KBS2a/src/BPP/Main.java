package BPP;

import BPPAlgorithms.FirstFit;

public class Main {

    public static void main(String[] args) {


           Product A1 = new Product(1,2,3,"green",10);
           Product A2 = new Product("green",10);
          // System.out.println(A1);
          // System.out.println(A2);
          
     //      BPPMainScreen headscreen = new BPPMainScreen(A1);
           
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
    }

}
