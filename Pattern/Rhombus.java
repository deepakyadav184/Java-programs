import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            if (i == 1 || i == rows)
                for (int j = 1; j <= rows; j++) {
                    System.out.print("*");
                }
            else {
                for (int j = 1; j <= rows; j++) {
                    if (j == 1 || j == rows)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
