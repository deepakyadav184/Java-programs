import java.util.Scanner;

public class Armstrong {
    static int cnt(int n){
        int count = 0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
    static int power(int x,int y){
        int res = 1;
        for (int i = 0;i<y; i++) {
            res*= x;
        }
        return res;
    }
    static boolean isArm(int n,int count){
        int temp = n;
        int sum =0;
        while(n>0){
            int digit = n%10;
            n/=10;
            sum = sum + power( digit,count);
        }
        if(temp == sum) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = s.nextInt();
        int count = cnt(num);
        if(isArm(num,count)){
            System.out.println("it is an Armstrong");
        }else{

            System.out.println("it is not Armstrong");
        }
        s.close();
    }
}
