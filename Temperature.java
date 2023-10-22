import java.util.Scanner;

public class Temperature {
    static void celcious(float temp){
        double cel = (temp*9)/5 +32 ;
        
        System.out.println("Temperature in calcious is: "+cel);
    }
    static void farhenhiet(float temp){
        double farhen = ((temp-32)*5)/9 ;
        
        System.out.println("Temperature in Farhenhiet is: "+farhen+"f");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Temp in Farhenhiet: ");
        celcious(s.nextFloat());

        System.out.print("Enter Temp in celcious: ");
        farhenhiet(s.nextFloat());
        
        
        s.close();
    }
}
