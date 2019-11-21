public class Exercise_9_2 {
    public static void main(String[] args) {
        Stock stock1 = new Stock("0RCL", "Oracle Corporation");
        stock1.setPrice(34.5, 34.35);
        System.out.printf("The percentage change in price is %.2f%%", stock1.getChangePercent());
    }
}

class Stock{
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(String specifiedSymbol, String specifiedName){
        symbol = specifiedSymbol;
        name = specifiedName;
    }

    void setPrice(double specifiedPreviousClosingPrice, double specifiedCurrentPrice){
        previousClosingPrice = specifiedPreviousClosingPrice;
        currentPrice = specifiedCurrentPrice;
    }



    double getChangePercent(){
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}