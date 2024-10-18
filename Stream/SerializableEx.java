package Stream;

import java.io.*;

class SerializEx implements Serializable {
    int rollno;
    String name;

    SerializEx(){

    }

    SerializEx(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }

    void show(){
        System.out.println("Roll No: "+rollno);
        System.out.println("Name: "+name);
    }
}

public class SerializableEx {
    public static void main(String[] args) throws IOException ,ClassNotFoundException{

//        FileOutputStream obj=new FileOutputStream("C:\\Users\\admin\\IdeaProjects\\CollectionFramework\\todat.txt");
//        ObjectOutputStream out=new ObjectOutputStream(obj);
//        SerializEx obj1=new SerializEx(1,"Krishna");
//        out.writeObject(obj1);
//        out.close();
//        obj.close();     //------>Write


        FileInputStream fin=new FileInputStream("C:\\\\Users\\\\admin\\\\IdeaProjects\\\\CollectionFramework\\\\todat.txt");
        ObjectInputStream in=new ObjectInputStream(fin);
        SerializEx obj=new SerializEx();
        SerializEx s=(SerializEx) in.readObject();
        s.show();            //------>Read

    }
}