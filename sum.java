import java.util.Scanner;

public class sum {
    public static void sum(int num){
        int sum=0;
       for(int i=1;i<=num;i++){
        sum=sum+i;
       }
       System.out.println("sum is"+sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int num=sc.nextInt();
        sum(num);
        sc.close();

    }
}
    
    

