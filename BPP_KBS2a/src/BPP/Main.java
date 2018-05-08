package BPP;

public class Main {

    public static void main(String[] args) {

        Product A1 = new Product(1, 2, 3, "green", "M");
        System.out.println(A1);
        BPPMainScreen headscreen = new BPPMainScreen(A1);
    }

}
