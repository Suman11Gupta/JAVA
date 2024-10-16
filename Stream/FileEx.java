package Stream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
public class FileEx {
    public static void main(String[] args) throws IOException{

//        File obj=new File("today.java");
//        if(obj.createNewFile()){
//            System.out.println("Created new file");
//        }else{
//            System.out.println("Already Exist");
//        }
//        System.out.println(obj.exists());
//        System.out.println(obj.getAbsolutePath());
//        System.out.println(obj.getName());
//        System.out.println(obj.getParent());
//        System.out.println(obj.getPath());       //---> File creating



//        File obj=new File("C:\\Users\\admin\\IdeaProjects\\CollectionFramework");
//        System.out.println(obj.isDirectory());
//        System.out.println(obj.isFile());
//
//
//        String files[]=obj.list();
//        System.out.println("All Files");
//        for(String name:files){
//            System.out.println(name);
//        }
//
//        System.out.println("Directory\t\tFiles");
//        File fileob[]=obj.listFiles();
//        for(File ob:fileob){
//            if(ob.isDirectory())
//                System.out.println("Dir....."+ob);
//            else
//                System.out.println("Files---->\t\t"+ob);
//        }



        File obj=new File("C:\\Users\\admin\\IdeaProjects\\CollectionFramework");
        String files[]=obj.list(new FilenameFilter() {
            @Override
            public boolean accept(File obj, String str) {
                if(str.toLowerCase().endsWith(".java"))
                    return true;
                else
                    return false;
            }
        });
        for(String f:files){
            System.out.println(f);
        }


    }
}
