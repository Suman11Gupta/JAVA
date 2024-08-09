package Suman;

public class Orders extends Client {
    String orderid[];
    int ordernumber[];
    Orders(String clientname[],String clientcity[],String location[],float clientcreditlimit[],String orderid[],int ordernumber[]){
        super(clientname,clientcity,location,clientcreditlimit);
        this.orderid=orderid;
        this.ordernumber=ordernumber;
    }

}
