package Stream;
import java.io.*;
import java.util.Scanner;

public class DirectoryAssignment3 {
    public static void main(String[] args) throws IOException {
        String dir;
        int choice;
        String sub = "";
        String file;
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
            System.out.println("Do you want to open sub Directory or File ");
            System.out.println("1.Sub directory");
            System.out.println("2.File");
            choice=sc.nextInt();

            if(choice==1){
                System.out.println("1.Enter sub directory name: ");
                sub=sc.next();
                File obj1=new File(dir,sub);
                File fileob1[]=obj1.listFiles();
                for(File ob1:fileob1){
                    if(ob1.isDirectory())
                        System.out.println("Dir....."+ob1);
                    else
                        System.out.println("Files---->\t\t"+ob1);
                }

            } else if(choice==2) {
                System.out.println("1.Read File");
                System.out.println("2.Write File");
                int choice2=sc.nextInt();
                System.out.println("1.Enter file name: ");
                file = sc.next();

                if(choice2==1){
                    try {
                        Reader obj1 = new FileReader(dir+"\\"+sub+"\\"+file);
                        int data = obj1.read();
                        System.out.println(data);
                        while (data >= 0) {
                            System.out.print((char) data );
                            data = obj1.read();
                        }
                        System.out.println();
                        obj1.close();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } else if (choice2==2) {
                    try{
                        Writer obj3=new FileWriter(dir+"\\"+sub+"\\"+file);
                        String data=sc.next();
                        obj3.write(data);
                        obj3.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }

            }

        }

    }
}
