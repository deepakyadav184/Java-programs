import java.util.Scanner;

public class CheckTriangle {
    static void isTrinagle(float a,float b,float c){
        if (a == b && b == c) {
            System.out.println("It is an Equilateral triangle ");
        }
        else if(a==b || b==c || c==a){
            System.out.println("It is an Isosceles triangle ");
        }
        else{
            System.out.println("It is an Scalene triangle ");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the sides of triangle: ");
        float a = s.nextFloat();
        float b = s.nextFloat();
        float c = s.nextFloat();
        isTrinagle(a,b,c);
        s.close();
    }
}
