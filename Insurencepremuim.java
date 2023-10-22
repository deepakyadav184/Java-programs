import java.util.Scanner;

public class Insurencepremuim {
    static void Premium(char Gender, int Age, String City) {
        if (Age >= 25) {
            if (Age <= 35 && Gender == 'M' && City.equals("Metro")) {
                System.out.println("Premium is 6%");
            } else if (Age <= 40 && Gender == 'M' && City.equals("Non-Metro")) {
                System.out.println("Premium is 4%");

            } else if (Age <= 42 && Gender == 'F' && City.equals("Metro")) {
                System.out.println("Premium is 3%");
            } else if (Age <= 45 && Gender == 'F' && City.equals("Non-Metro")) {
                System.out.println("Premium is 2%");
            }
        } else {
            System.out.println("Not Insured");
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Person Name :");
        String Name = s.nextLine();

        System.out.print("Enter Person gender [M or F] :");
        char Gender = s.nextLine().charAt(0);

        System.out.print("Enter Person city [Metro or Non-Metro] :");
        String City = s.nextLine();

        System.out.print("Enter Person Age :");
        int Age = s.nextInt();
       
        Premium(Gender, Age, City);

    }
}
