package CollectionFramework;
import java.util.*;

public class CarMain {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String details;
        Map<String,Car> obj=new HashMap<String, Car>();
        obj.put("Sedan",new Car("AudiA4",1200,12,100000));
        obj.put("Hatchback",new Car("Tata Trigo",1400,14,140000));
        obj.put("MUV",new Car("Kia Carens",1500,15,1500000));

        System.out.println("Sedan");
        System.out.println("Hatchback");
        System.out.println("MUV");
        System.out.println("Enter the car type for details: ");
        details=sc.next();
        for(Map.Entry<String,Car> ob:obj.entrySet()){
            if(details.equals(ob.getKey())){
                System.out.println(ob.getValue());
            }

        }
    }
}
