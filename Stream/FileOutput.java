package Stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        FileOutputStream obj=new FileOutputStream("C:\\Users\\admin\\IdeaProjects\\CollectionFramework\\todat.txt");


//        String str="Have a nice day!!!";
//        byte b[]=str.getBytes();
//        obj.write(b);
//        obj.close();
//        System.out.println("Data Successfully writen in file ");


        String str1="",data="";
        System.out.println("What is Stream?");
        while(!data.equals("exit")){
            data=sc.nextLine();
            if(!data.equals("exit"))
                str1=str1+data+"\n";
        }
        obj.write(str1.getBytes());
        obj.close();

        
//        File obj1=new File("C:\\Users\\admin\\IdeaProjects\\CollectionFramework\\today.txt");
//        Scanner sc1=new Scanner(obj1);
//        while(sc1.hasNextLine()){
//            System.out.println(sc1.nextLine());
//        }

    }
}
