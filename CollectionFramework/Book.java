package CollectionFramework;

public class Book {
    int bid,np;
    String name;

    public Book(int bid, int np, String name) {
        this.bid = bid;
        this.np = np;
        this.name = name;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getNp() {
        return np;
    }

    public void setNp(int np) {
        this.np = np;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", np=" + np +
                ", name='" + name + '\'' +
                '}';
    }
}
