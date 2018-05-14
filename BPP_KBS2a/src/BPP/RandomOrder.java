package BPP;

import java.util.ArrayList;
import java.util.Random;

public class RandomOrder implements OrderInterface{

    private ArrayList<Product> productArray = new ArrayList<>();

    public RandomOrder() {
        Random random = new Random();
        int n = (random.nextInt(4) + 1);
        productArray.add(new Product(1, (random.nextInt(5) + 1), (random.nextInt(5) + 1), String.format("#%06x", random.nextInt(256 * 256 * 256)), (random.nextInt(4) + 1) * 10));  //maak een nieuw product object aan
        for (int i = 0; i < n; i++) { //voeg tussen de 2 en 5 producten toe aan de array
            int newX = (random.nextInt(5) + 1);
            int newY = (random.nextInt(5) + 1);
            boolean check = true;

            for (Product x : productArray) {
                if (x.getX() == newX && x.getY() == newY) {
                    check = false;
                }
            }

            if (check) {
                productArray.add(new Product((i + 2), newX, newY, String.format("#%06x", random.nextInt(256 * 256 * 256)), (random.nextInt(4) + 1) * 10));  //maak een nieuw product object aan
            } else {
                i--;
            }
        }
    }

    @Override
    public void print() { //print de gegevens in de array
        productArray.forEach((x) -> {
            System.out.println("id:" + x.getProductId() + " X:" + x.getX() + " Y:" + x.getY() + " C:" + x.getColor() + " S:" + x.getSize());
        });
    }

    @Override
    public int getOrderSize() { //krijg de lengthe van de array
        return productArray.size();
    }

    @Override
    public int getProductSize(int number) { //krijg de fysieke lengthe van de array
        return productArray.get(number - 1).getSize();
    }

    @Override
    public String getProductColor(int number) {
        return productArray.get(number - 1).getColor();
    }

    @Override
    public int getProductId(int number) {
        return productArray.get(number - 1).getProductId();
    }

    @Override
    public int getProductX(int number) {
        return productArray.get(number - 1).getX();
    }

    @Override
    public int getProductY(int number) {
        return productArray.get(number - 1).getY();
    }

}
