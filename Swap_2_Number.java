import java.util.Scanner;

public class Swap_2_Number {
    static void SWAP(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter digit 1: ");
        int num1 = s.nextInt();
        System.out.print("Enter digit 2: ");
        int num2 = s.nextInt();
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("After Swap");
        System.out.println("digit 1 is "+num1);
        System.out.println("digit 2 is "+num2);
        s.close();
    }
    static void SWAP2(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter digit 1: ");
        int num1 = s.nextInt();
        System.out.print("Enter digit 2: ");
        int num2 = s.nextInt();
        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;
        System.out.println("After Swap");
        System.out.println("digit 1 is "+num1);
        System.out.println("digit 2 is "+num2);
        s.close();
    }
    static void SWAP3(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter digit 1: ");
        int num1 = s.nextInt();
        System.out.print("Enter digit 2: ");
        int num2 = s.nextInt();
        num1 = num1*num2;
        num2 = num1/num2;
        num1 = num1/num2;
        System.out.println("After Swap");
        System.out.println("digit 1 is "+num1);
        System.out.println("digit 2 is "+num2);
        s.close();
    }

    public static void main(String[] args) {
        SWAP();
        System.out.println("Using Bitwise");
        SWAP2();
        System.out.println("Using multiply and divide operator");
        SWAP3();
    }
}
