package CollectionFramework;

public class Car {
    String name;
    int average,perMiles,price;

    public Car(String name, int average, int perMiles, int price) {
        this.name = name;
        this.average = average;
        this.perMiles = perMiles;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public int getPerMiles() {
        return perMiles;
    }

    public void setPerMiles(int perMiles) {
        this.perMiles = perMiles;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", average=" + average +
                ", perMiles=" + perMiles +
                ", price=" + price +
                '}';
    }
}
