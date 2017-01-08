public class PE3_6 {
    public static void main(String[] args) {
        System.out.println("The list of prices.");
        CashRegister money = new CashRegister();
        money.printReceipt(10);
        money.printReceipt(5);
        money.printReceipt(1);
        money.printReceipt(9);
        System.out.println(money.getStuff());
    }
}
