import java.util.Scanner;

public class factorial {
    static int fact(int n){
        int ans=1;
        while(n>0){
            ans=n*ans;
            n--;       
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER: ");
        int n=s.nextInt();
        
        System.out.println("FACTORIAL OF A NUMBER IS= "+fact(n));
    }
}
