package Inheritance;

import Suman.Creditlimit;

public class CreditLimit1 extends Client1{
 CreditLimit1(String order_id,int order_number,String location,float amount,float gst,String client_name,String client_city,float clientCreditLimit){
  super(order_id,order_number,location,amount,gst,client_name,client_city,clientCreditLimit);

 }
void displayClientDetails(){
 System.out.println("Order id "+order_id);
 System.out.println("order Number "+order_number);
 System.out.println("Location "+location);
 System.out.println("Amount "+amount);
 System.out.println("gst "+gst);
 System.out.println("Client name "+client_name);
 System.out.println("Client city "+client_city);
 System.out.println("Client Credit Limit "+clientCreditLimit);
//  String order_id="A11";
//  int order_number=121;
//  String location="Borivali";
//  float amount=12000;
//  float gst=amount*2/100;
//  String client_name="SS";
//  String client_city="Mumbai";
//  float clientCreditLimit=1000;
//  CreditLimit1 ob=new CreditLimit1(order_id,order_number,location,amount,gst,client_name,client_city,clientCreditLimit);
//   ob.checkCreditLimit();
 }

 public static void main(String[] args) {

  CreditLimit1 ob=new CreditLimit1("A11",121,"Borivali",12000,12000*2/100,"SS","Mumbai",1000);
  ob.displayClientDetails();
  System.out.println("Total Amount "+ob.calculateTotalAmount());
  System.out.println("Total credit "+ob.updateCredit(200));
  ob.check();
  
 }
}
