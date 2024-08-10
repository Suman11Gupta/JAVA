package Inheritance;

public class Orders1 {
     String order_id,location;
     int order_number;
     float amount,gst,total_amount;

     Orders1(String order_id,int order_number,String location,float amount,float gst){
         this.order_id=order_id;
         this.order_number=order_number;
         this.location=location;
         this.amount=amount;
         this.gst=gst;
     }

     float calculateTotalAmount(){
         total_amount=amount+gst;
         return total_amount;
     }

}
