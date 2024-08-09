package Suman;

public class Creditlimit extends Orders {
    float amount[],gst[];
    Creditlimit(String orderid[],int ordernumber[],String location[],String clientname[],String clientcity[],float clientcreditlimit[],
                float amount[],float gst[]){
        super(clientname,clientcity,location,clientcreditlimit,orderid,ordernumber);
        this.amount=amount;
        this.gst=gst;

    }

    void info(){
//        int size[]= new int[10];
        System.out.println("Order id | Order number | Location | Client Name | Client City | ClientCreditLimit | Amount | GST | TotalAmount ");

        for(int i=0;i<clientname.length;i++){
            System.out.println(orderid[i]+" | "+ordernumber[i]+" | "+location[i]+" | "+clientname[i]+" | "+clientcity[i]+" | "+clientcreditlimit[i]+" | "+amount[i]+" | "+gst[i]*amount[i]/100+" | "+amount[i]+gst[i]);
        }
    }

    public static void main(String[] args) {
        String orderid[]={"A0","A1","A2","A3","A4","A5","A6","A7","A8","A9"};
        int ordernumber[]={1,2,3,4,5,6,7,8,9,10};
        String location[]={"Borivali","Kandivali","Borivali","Kandivali","Borivali","Kandivali","Borivali","Kandivali","Borivali","Kandivali"};
        String clientname[]={"Suman","Sonali","Moumita","Janhavi","Vineet","Viru","Vira","virat","Viren","Jiya"};
        String clientcity[]={"Mumbai","Goa","Mumbai","Goa","Mumbai","Goa","Mumbai","Goa","Mumbai","Goa"};
        float clientcreditlimit[]={20000,30000,20000,30000,20000,30000,20000,30000,20000,30000};
        float amount[]={100000,200000,100000,200000,100000,200000,100000,200000,100000,200000};
        float gst[]={2,5,4,8,5,4,8,6,8,4};
        Creditlimit ob=new Creditlimit(orderid,ordernumber,location,clientname,clientcity,clientcreditlimit,amount,gst);
        ob.info();

    }
}
