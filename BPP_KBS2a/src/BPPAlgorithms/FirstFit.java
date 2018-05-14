package BPPAlgorithms;

import BPP.OrderInterface;

public class FirstFit implements BPPAlgorithmInterface{
    
    private OrderInterface order;

    public FirstFit(OrderInterface order) {
       this.order = order; 
    }

    @Override
    public void printSolution(){
        System.out.print("test");
    }
}

