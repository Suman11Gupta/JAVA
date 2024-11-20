package Stock_Market;

public interface StockObserver {
    void update(String stockSymbol,double stockPrice);
}
