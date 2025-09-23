public class Main {}
    public static void main(String[] args) {
    double purchasePrice = 10;
    double salestax = .05;
    double totalprice = 0;
    totalprice = salestax * purchasePrice;
    totalprice = purchasePrice + totalprice;
    System.out.println("the price of the item is $" + purchasePrice);
    System.out.println("the sales tax is $" + salestax);
    System.out.println("the total price is $" + totalprice);

    }

