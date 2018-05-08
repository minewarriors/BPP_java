package BBP;

public class Product {

<<<<<<< HEAD
    private int productId;
    private int x;
    private int y;
    private String color;
    private String size;

    public Product(int productId, int x, int y, String color, String size) {
        this.productId = productId;
        this.x = x;
        this.y = y;
        this.color = color;
        this.size = size;
    }

    public int getProductId() {
        return productId;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", x=" + x + ", y=" + y + ", color=" + color + ", size=" + size + '}';
    }
    
    
=======
>>>>>>> 802c75f5957f8fc2893ee121e69e05409b2fc5b9
}
