public class ProductPrinter {
    public static void main(String[] args) {
        Product toaster = new Product("Toaster", 15);
        Product tv = new Product("Television", 500);
        
        System.out.println("The first product is " + toaster.getName() + " and the price is " + toaster.getPrice());
        System.out.println("The second product is " + tv.getName() + " and the price is " + tv.getPrice());
        
        toaster.reducePrice(5);
        tv.reducePrice(5);
        
        System.out.println("The reduced price of the " + toaster.getName() + " is " + toaster.getPrice());
        System.out.println("The reduced price of the " + tv.getName() + " is " + tv.getPrice());        
    }
}
