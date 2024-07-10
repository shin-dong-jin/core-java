package productmanagement;

public class Product {
    private String name;
    private int quantity, sellingPrice, buyingPrice, shipmentFee;

    public Product(String name, int quantity, int sellingPrice, int buyingPrice, int shipmentFee) {
        this.name = name;
        this.quantity = quantity;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
        this.shipmentFee = shipmentFee;
    }

    private int calcTotalSelling() {
        return quantity * sellingPrice;
    }

    private int calcTotalBuying() {
        return quantity * buyingPrice;
    }

    private int calcProfit() {
        return calcTotalSelling() - (calcTotalBuying() + shipmentFee);
    }

    private double calcProfitRate() {
        return (double) calcProfit() / calcTotalBuying() * 100.;
    }

    @Override
    public String toString() {
        return String.format("%-10s\t%,5d\t%,5d\t%,5d\t%,5d\t%,5d\t%5.2f%n",
                name, quantity, sellingPrice, buyingPrice, shipmentFee, calcProfit(), calcProfitRate());
    }
}
