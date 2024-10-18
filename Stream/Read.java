package Stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Read {
    public static void main(String[] args) {
        try{
            Reader obj=new FileReader("C:\\Users\\admin\\IdeaProjects\\CollectionFramework\\todat.txt");
            int data=obj.read();
            System.out.println(data);
            while(data>=0){
                System.out.println((char) data);
                data=obj.read();
            }
            obj.close();;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
