import java.util.Scanner;
public class leapyear {
    static void isleapyear(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if (year %4 == 0 || year %400 == 0) {
            if (year %100 != 0) {
                System.out.println("year is leap year");
            }
        }else{
            
            System.out.println("year is not a leap year");
        }
        sc.close();
    }
    public static void main(String[] args) {
        isleapyear();
    }
}
