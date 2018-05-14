package BPPAlgorithms;

import BPP.OrderInterface;

public class BestFitDecreasing implements BPPAlgorithmInterface{

    private OrderInterface order;

    public BestFitDecreasing(OrderInterface order) {
       this.order = order; 
    }
    
    @Override
    public void printSolution(){
        System.out.print("test");
    }
}