package Patterns;

public class FactoryMain {
    public static void main(String[] args) {
        Factory bill=new Factory();
        Billing bill_1=bill.computeBill("Commercial");
        bill_1.getBill();
    }
}
