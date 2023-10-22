import java.util.Scanner;

public class prime {
    public static void isprime(int num){
        for(int i=2;i<=(num/2);i++){
     if(num%i==0){
    System.out.println("no is not prime");
    break;
        }
        else if(i>=(num/2)){
            System.out.println(" prime");
        }
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int num=sc.nextInt();
        isprime(num);
        sc.close();
    
}
}
