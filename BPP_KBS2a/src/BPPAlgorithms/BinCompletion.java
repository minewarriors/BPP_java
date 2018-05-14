package BPPAlgorithms;

import BPP.OrderInterface;

public class BinCompletion implements BPPAlgorithmInterface{
    
    private OrderInterface order;

    public BinCompletion(OrderInterface order) {
       this.order = order; 
    }

    @Override
    public void printSolution(){
        System.out.print("test");
    }
}