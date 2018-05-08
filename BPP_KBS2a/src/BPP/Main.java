package BPP;

public class Main {

<<<<<<< HEAD
    public static void main(String[] args) {

        Product A1 = new Product(1, 2, 3, "green", "M");
        System.out.println(A1);
        BPPMainScreen headscreen = new BPPMainScreen(A1);
=======
           Product A1 = new Product(1,2,3,"green",10);
           Product A2 = new Product("green",10);
          // System.out.println(A1);
          // System.out.println(A2);
           
           RandomProductArray b2 = new RandomProductArray();
           b2.print();
           System.out.println(b2.getSize());
           System.out.println(b2.getProductSize(1));
           System.out.println(b2.getProductColor(1));
>>>>>>> e490a7e7b235527683445708df58d1253ba6845c
    }

}
