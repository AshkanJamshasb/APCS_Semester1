public class CashRegister {
    private String prices = "";
    private String priceString;
    
    public void printReceipt(int nextPrice) {
        priceString = String.valueOf(nextPrice) + "\n";
        prices = prices.concat(priceString);
    }
    
    public String getStuff() {
        return prices;
    }
}

