package Inheritance;

public class Client1 extends Orders1 {
    String client_name,client_city;
    float clientCreditLimit,totalCredit;
    Client1(String order_id,int order_number,String location,float amount,float gst,String client_name,String client_city,float clientCreditLimit){
        super(order_id,order_number,location,amount,gst);
        this.client_name=client_name;
        this.client_city=client_city;
        this.clientCreditLimit=clientCreditLimit;
    }

    float updateCredit(float newCredit){
       totalCredit=clientCreditLimit+newCredit;
       return totalCredit;
    }

    void check(){
        if(totalCredit>clientCreditLimit){
            System.out.println("Credit limit exceeded: yes");
        }else{
            System.out.println("Credit limit exceeded: No");
        }

    }

//    float checkCreditLimit(){
//        if(totalCredit>clientCreditLimit){
//            System.out.println("Credit limit exceeded: yes");
//        }else{
//            System.out.println("Credit limit exceeded: No");
//        }
//        return checkCreditLimit();
//    }
}
