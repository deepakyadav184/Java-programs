import java.util.Scanner;

public class Sqrt {
    static double sqroot(double n){
        double ans;
        ans = Math.pow(n, 0.5);
        return ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double n = s.nextDouble();
        System.out.println(sqroot(n));
        s.close();
    }
}
