package BPP;

import java.util.ArrayList;
import java.util.Random;

public class RandomOrder {

    private ArrayList<Product> productArray = new ArrayList<>();

    public RandomOrder() {
        Random random = new Random();
        for (int i = 0; i <= random.nextInt(6); i++) {
            productArray.add(new Product((i + 1), (random.nextInt(5) + 1), (random.nextInt(5) + 1), String.format("#%06x", random.nextInt(256 * 256 * 256)), (random.nextInt(4) + 1)*10));
        }
    }

    public void print() {
        for (Product x : productArray) {
            System.out.println("id:" + x.getProductId() + " X:" + x.getX() +  " Y:" + x.getY() + " C:" + x.getColor() + " S:" + x.getSize());
        }
    }

    public int getSize() {
        return productArray.size();
    }

    public int getProductSize(int number) {
        return productArray.get(number - 1).getSize();
    }

    public String getProductColor(int number) {
        return productArray.get(number - 1).getColor();
    }

    public int getProductId(int number) {
        return productArray.get(number - 1).getProductId();
    }

    public int getProductX(int number) {
        return productArray.get(number - 1).getX();
    }

    public int getProductY(int number) {
        return productArray.get(number - 1).getY();
    }

}
