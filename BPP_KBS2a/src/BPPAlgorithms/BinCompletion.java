package BPPAlgorithms;

import BPP.Box;
import BPP.OrderInterface;
import java.util.ArrayList;

public class BinCompletion implements BPPAlgorithmInterface{
    
    private OrderInterface order;

    public BinCompletion(OrderInterface order) {
       this.order = order; 
    }

    @Override
    public ArrayList<Box> calculate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}