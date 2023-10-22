import java.util.Scanner;

public class Salary_Slip {
    static double Hra(double salary){
        return salary*0.3;
    }
    static double Da(double salary){
        return salary*0.2;
        
    }
    static double Ta(double salary){
        return salary*0.1;

    }
    static double netSalary(double salary, double hra,double da,double ta,double pf){
        return salary+hra+da+ta-pf;
    }
    static void Print(double netSalary){
        System.out.println("Net Salary is"+ netSalary);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the salary: ");
        double salary = s.nextDouble();
        double hra = Hra(salary);
        double da = Da(salary);
        double ta = Ta(salary);
        double NetSalary = netSalary(salary,hra, da, ta, 1500);
        Print(NetSalary);
        s.close();
    }
}
