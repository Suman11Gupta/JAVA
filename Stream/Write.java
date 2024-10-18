package Stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Write {
    public static void main(String[] args) {
        try{
            Writer obj=new FileWriter("C:\\\\Users\\\\admin\\\\IdeaProjects\\\\CollectionFramework\\todat.txt");
            String data="Every people love their own country in the world.";
            obj.write(data);
            obj.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
