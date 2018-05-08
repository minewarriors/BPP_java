package BPP;

import java.util.ArrayList;
import java.util.Random;

public class RandomProductArray {

    private ArrayList<Product> productArray = new ArrayList<>();

    public RandomProductArray() {
        Random random = new Random();
        for (int i = 0; i <= random.nextInt(6); i++) {
            productArray.add(new Product(String.format("#%06x", random.nextInt(256 * 256 * 256)), random.nextInt(35)+1));
        }
    }

    public void print() {
        for (Product x : productArray) {
            System.out.println(x.getColor() + ' ' + x.getSize());
        }
    }
    public int getSize(){
        return productArray.size();
    }
    public int getProductSize(int number){
        return productArray.get(number - 1).getSize();
    }
    public String getProductColor(int number){
        return productArray.get(number - 1).getColor();
    }
    
}
