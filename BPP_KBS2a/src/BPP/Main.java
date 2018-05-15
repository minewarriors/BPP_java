package BPP;

import BPPAlgorithms.FirstFit;

public class Main {

    public static void main(String[] args) {
         
           //BPPMainScreen headscreen = new BPPMainScreen();
           
           RandomOrder b2 = new RandomOrder();
           b2.print();
           

           FirstFit test = new FirstFit(b2);
         //  test.printSolution();
           test.calculate();
    }

}
