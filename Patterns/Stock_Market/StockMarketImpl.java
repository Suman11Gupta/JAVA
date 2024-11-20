package Stock_Market;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class StockMarketImpl implements StockMarket{
    private List<StockObserver> obj=new ArrayList<>();
    public void registerObserver(StockObserver observer){
        obj.add(observer);
    }
    public void removeObserver(StockObserver observer){
        obj.remove(observer);
    }
    public void notifyObserver(String stockSymbol,double stockPrice){
        for(StockObserver obj1:obj){
            obj1.update(stockSymbol,stockPrice);
        }
    }
    public void setStockPrice(String stockSymbol,double stockPrice){
        notifyObserver(stockSymbol,stockPrice);
    }
}
