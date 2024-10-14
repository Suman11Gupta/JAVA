package CollectionFramework;

public class Author {
    int Id;
    String name,city;
    Book book;
    public Author(int id, String name, String city,Book book) {
        this.book=book;
        Id = id;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Author{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                book+
                '}';
    }
}
