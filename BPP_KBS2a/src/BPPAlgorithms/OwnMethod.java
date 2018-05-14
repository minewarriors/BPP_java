package BPPAlgorithms;

import BPP.OrderInterface;

public class OwnMethod implements BPPAlgorithmInterface {

    private OrderInterface order;

    public OwnMethod(OrderInterface order) {
        this.order = order;
    }

    @Override
    public void printSolution() {
        System.out.print("test");
    }
}
