import java.util.Scanner;

public class Checknumber {
    static void check(int num){
        if (num == 0) {
            System.out.println("number is zero ");
        }
        if(num > 0){
            System.out.println("Num is Positive ");
        }else{
            System.out.println("Num is negative ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = s.nextInt();
        check(num);
        s.close();

    }
}
