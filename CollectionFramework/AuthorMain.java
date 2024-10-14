package CollectionFramework;
import java.util.*;
public class AuthorMain {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nid;

        List <Author> obj=new ArrayList<Author>();
        obj.add(new Author(101,"SS","Mumbai",new Book(11,589,"English")));
        obj.add(new Author(102,"SD","Maharashtra",new Book(12,566,"Maths")));
        obj.add(new Author(103,"SV","Pune",new Book(11,589,"History")));
        for(Author ob:obj){
            System.out.println(ob);
        }

        System.out.println("Enter Author Id You want To Delete: ");
        nid=sc.nextInt();

//        switch (nid){
//            case 101:
//                obj.remove(0);
//                break;
//            case 102:
//                obj.remove(1);
//                break;
//            case 103:
//                obj.remove(2);
//                break;
//        }
//        for(Author ob:obj){
//            System.out.println(ob);
//        }

         Iterator<Author> itr=obj.iterator();
        while(itr.hasNext()){
            Author ob=itr.next();
            if(ob.getId()==nid){
                obj.remove(ob);
                break;
            }
        }

        for(Author ob:obj){
            System.out.println(ob);
        }

    }
}
