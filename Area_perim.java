import java.util.Scanner;

public class Area_perim {
    static double getdata(){
        Scanner s = new Scanner(System.in);
        double dimension = s.nextDouble();
        return dimension;
    }
    static double Area(double length, double breadth){
        return length*breadth ;
    }
    static double Perimeter(double length, double breadth){
        return 2*(length+breadth) ;
    }
    public static void main(String[] args) {
        System.out.print("Enter the length: ");
        double l = getdata();
        System.out.print("Enter the breadth: ");
        double b = getdata();
        System.out.println("Area is "+ Area(l, b));
        System.out.println("Perimeter is "+ Perimeter(l, b));
    }
}
