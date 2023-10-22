import java.util.Scanner;

public class SimpleIntrest {
    static double getdata(){
        Scanner s = new Scanner(System.in);
        double value = s.nextDouble();
        return value;
    }
    static double Simpleintrest(double p,double r,double t){
        double intrest = (p*r*t)/100;
        return intrest;
    }
    public static void main(String[] args) {
        System.out.print("Enter the Priciple Amount: ");
        double p = getdata();
        System.out.print("Enter the Rate of Intrest : ");
        double r = getdata();
        System.out.print("Enter the Time period: ");
        double t = getdata();
        System.out.println("Simple Intrest is "+ Simpleintrest(p, r, t));
    }
}
