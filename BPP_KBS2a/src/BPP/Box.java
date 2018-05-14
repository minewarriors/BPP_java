/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BPP;

import java.util.ArrayList;

/**
 *
 * @author Christiaan
 */
public class Box {
    
    private int size;
    
    private ArrayList<Product> productBoxArray = new ArrayList<>();

    public Box() {
    }

    public void AddProduct(Product product) {
        productBoxArray.add(product);
    }
    
}
