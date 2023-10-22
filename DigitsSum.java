import java.util.Scanner;

public class DigitsSum {
    static void sum(int n){
        int sum=0;
        while(n!=0){
            sum+=(n%10);
            n=n/10;
        }
        System.out.println("THE DIGIT SUM IS= "+sum);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER: ");
        int n=s.nextInt();
        sum(n);
    }
}
