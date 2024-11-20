package Stock_Market;

public class Investor implements StockObserver {
    public String name;
    public Investor(String name){
        this.name=name;
    }
    public void update(String stockSymbol,double stockPrice){
        System.out.println(name +"received an update for "+stockSymbol+":$"+stockPrice);
    }
}
