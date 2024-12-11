package Localization;
import java.util.Locale;
public class Locale_Ex {
    public static void main(String[] args) {
        Locale ob=new Locale("mr","IN");
        System.out.println("Country="+ob.getCountry());
        System.out.println("Display Language="+ob.getDisplayLanguage());
        System.out.println("Display Name="+ob.getDisplayName());
        Locale loc[]=Locale.getAvailableLocales();
        System.out.println("Installed Locale: ");
        for(Locale obj:loc){
            if(obj.getCountry().equals("IN")){
                System.out.println(obj.getDisplayName()+"------"+ob.getCountry());
                System.out.println("Language="+ob.getLanguage());
            }
        }

        // Create generics english speaking locale.
        Locale ob1=new Locale("en");
        // Create english speaking ,canadian locale.
        Locale ob2=new Locale("en","CA");
    }
}
