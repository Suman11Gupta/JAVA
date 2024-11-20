package Stock_Market;

public interface StockMarket {
    void registerObserver(StockObserver observer);
    void removeObserver(StockObserver observer);
    void notifyObserver(String stockSymbol,double stockPrice);
}
