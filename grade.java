import java.util.Scanner;

public class grade {
    public static void grade(double per){
        if(per>=90 ){
            System.out.println("grade A:");
        }
        else if(per>=70 &&  per < 90){
            System.out.println("grade B");
        }
        else if(per  >=50 && per< 70){
            System.out.println("grade C:");
        }
        else {
            System.out.println("grade D");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.print("enter the percentage %: ");
            double per =sc.nextInt();
            grade(per);
            sc.close();
        }
    }
    

