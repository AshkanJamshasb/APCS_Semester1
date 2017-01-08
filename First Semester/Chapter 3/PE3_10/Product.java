public class Product{
    private String productName;
    private double productPrice;
    
    Product(String name, double price) {
        productName = name;
        productPrice = price;
    }
    
    public String getName() {
        return productName;
    }
    
    public double getPrice() {
        return productPrice;
    }
    
    public void reducePrice(double price) {
        productPrice -= price;
    }
}