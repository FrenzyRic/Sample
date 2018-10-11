package Supermarket;

public class MainMarket {
    public static void main(String[] args) {
        Product cheese = new Product("Cheese",25);
        Product meat = new Product("Meat", 99);

        Supermarket market = new Supermarket();
        market.registerProduct(cheese);
        market.registerProduct(meat);

        System.out.println(market);
    }
}
