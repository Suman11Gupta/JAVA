package Patterns;

public class Factory {
    public Billing computeBill(String Type){
        if(Type==null)
        {
            return null;
        }
        if(Type.equalsIgnoreCase("Domestic")){
            return new Domestic();
        }
        else if(Type.equalsIgnoreCase("Commercial")){
            return new Commercial();
        }
        else if(Type.equalsIgnoreCase("Institutional")){
            return new Institutional();
        }
        return null;
    }
}
