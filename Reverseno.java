import java.util.Scanner;

public class Reverseno {
    static int reverse(int num){
        int rev=0;
        while (num>0) {
            rev = (rev*10) + (num%10);
            num/=10; 
        }
        return rev;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number: ");
        int num = sc.nextInt();

        System.out.println("Revrse is: "+reverse(num));
        sc.close();
    }
}
