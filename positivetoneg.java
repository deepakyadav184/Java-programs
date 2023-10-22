import java.util.Scanner;

public class positivetoneg {
    public static void postoneg(int num){
        if(num==0){
            System.out.println("num is zero");
        } else if(num>0){
            System.out.println("num is psitive :"+num);
        }
        else
        {
            System.out.println("num is negative");
        }
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the num :");
    int num=sc.nextInt();
    postoneg(num);
    sc.close();
}
}