public class Exercise09_02 {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");

        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);

        System.out.println("Previous Closing Price: " +
            stock.getPreviousClosingPrice());
        System.out.println("Current Price: " +
            stock.getCurrentPrice());
        System.out.println("Price Change: " +
            stock.getChangePercent() * 100 + "%");
    }
}

class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock() {
    }

    public Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getChangePercent() {
        return (currentPrice - previousClosingPrice) /
            previousClosingPrice;
    }

    public void setPreviousClosingPrice(double newPreviousClosingPrice) {
        previousClosingPrice = newPreviousClosingPrice;
    }

    public void setCurrentPrice(double newCurrentPrice) {
        currentPrice = newCurrentPrice;
    }
}
