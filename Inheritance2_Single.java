package Suman;

public class Inheritance2_Single extends Inheritance_Single {

    String book;
    Inheritance2_Single(String Title, String Author, int Year, String Book) {
        super(Title, Author, Year);
        this.book=Book;
    }

    public static void main(String[] args) {
        Inheritance2_Single obj=new Inheritance2_Single("Tutorial","Suman",2024,"English");
        System.out.println("Title "+obj.title);
        System.out.println("Author "+obj.author);
        System.out.println("Year "+obj.year);
        System.out.println("Book "+obj.book);
    }

}
