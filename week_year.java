import java.util.Scanner;

public class week_year {
public static void week_year(int num){
    switch(num){
        case 1:
        System.out.println(" 1.sunday \n 2.monday \n3.tue \n 4.wed \n 5.thus \n 6.friday \n 7.sat");
        break;
        case 2:
        System.out.println("1.jan \n 2.feb \n 3.march \n 4.april \n 5. may \n 6.june \n7.july \n 8.aug \n9. sep\n 10.oct \n 11.nov \n 12.dec ");
       break;
       default :
       System.out.println("invalid ");
       break;
    }

}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("press 1.for weeks \n 2.for years");
        int num=sc.nextInt();
        week_year(num);
        sc.close();
    }
    
}
