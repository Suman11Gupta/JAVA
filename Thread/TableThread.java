package Thread;

class Table extends Thread{
    void show(int a){
//        synchronized (this){
            for(int i=1;i<=10;i++){
                try{
                    Thread.sleep(500);
                }catch(Exception e){

                }
                System.out.println(a*i);
            }

//        }
    }
}

class Table2 extends Thread{
    void show(int b){
//        synchronized (this){
            for(int i=1;i<=10;i++){
                try{
                    Thread.sleep(500);
                }catch(Exception e){

                }
                System.out.println(b*i);
            }

//        }
    }
}
public class TableThread {
    public static void main(String[] args) {
//        int a=5;
//        int b=6;

        Table obj = new Table();
        obj.show(5);
        obj.show(6);
    }
    }
