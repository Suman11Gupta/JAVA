package Thread;

class MyTh extends Thread{
    MyTh(String name){
        super(name);
    }

    public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println(getName()+"-------->"+i);
                System.out.println("have a nice day!!!");
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
              e.printStackTrace();
        }
    }
}

public class ThreadEx {
    public static void main(String[] args) throws  InterruptedException {
        Thread ob=Thread.currentThread();
        System.out.println(ob);
        System.out.println("alive="+ob.isAlive());
        ob.setName("Suman...");
        System.out.println("Name="+ob.getName());
        System.out.println("Priority="+ob.getPriority());
        
        MyTh ob1=new MyTh("Learning");
        ob1.start();
    }
}
