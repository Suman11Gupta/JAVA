package Generics;
import java.util.*;
public class AuthorMain {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nid;

        List <Author> obj=new ArrayList<Author>();
        obj.add(new Author(101,"SS","Mumbai"));
        obj.add(new Author(102,"SD","Maharashtra"));
        obj.add(new Author(103,"SV","Pune"));
        for(Author ob:obj){
            System.out.println(ob);
        }

        List <Book> obj1=new ArrayList<Book>();
        obj1.add(new Book(11,589,"English"));
        obj1.add(new Book(12,566,"Maths"));
        obj1.add(new Book(11,589,"History"));
        for(Book ob1:obj1){
            System.out.println(ob1);
        }

        System.out.println("Enter Author Id: ");
        nid=sc.nextInt();
       switch (nid){
           case 101:
               obj.remove(0);
               break;
           case 102:
               obj.remove(1);
               break;
           case 103:
               obj.remove(2);
               break;
       }
        for(Author ob:obj){
            System.out.println(ob);
        }



    }
}
