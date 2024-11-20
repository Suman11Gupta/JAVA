package Stock_Market;

public class StockMain {
    public static void main(String[] args) {
        StockMarket obj=new StockMarketImpl();

        StockObserver investor1=new Investor("Alice");
        StockObserver investor2=new Investor("Bob");

        obj.registerObserver(investor1);
        obj.registerObserver(investor2);
//
//        obj.setStockPrice("INFY",1250.0);
//        obj.setStockPrice("TCS",1250.0);

        obj.removeObserver(investor1);

//        obj.setStockPrice("Wipro",700.0);
    }
}
