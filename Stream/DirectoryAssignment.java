package Stream;
import java.io.File;
import java.util.Scanner;
public class DirectoryAssignment {
    public static void main(String[] args) {
        String dir;
        String choice,sub;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the directory: ");
        dir=sc.nextLine();
        File obj=new File(dir);
        File fileob[]=obj.listFiles();
        for(File ob:fileob){
            if(ob.isDirectory())
                System.out.println("Dir....."+ob);
            else
                System.out.println("Files---->\t\t"+ob);
        }

        while(true){
            System.out.println("Do you want to open sub directory? Yes/No");
            choice=sc.nextLine();
            if(choice.equals("Yes")){
                System.out.println("1.Enter sub directory name: ");
                sub=sc.nextLine();
                File obj1=new File(dir,sub);
                File fileob1[]=obj1.listFiles();
                for(File ob1:fileob1){
                    if(ob1.isDirectory())
                        System.out.println("Dir....."+ob1);
                    else
                        System.out.println("Files---->\t\t"+ob1);
                }

            } else if (choice.equals("No")) {
                break;
            }
        }


    }
}
