import java.util.*;  
public class Tripattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows: ");
        int m = sc.nextInt();
        // System.out.println(m);
        // for (int i = 1; i <= m; i++) {
        //     for (int j = m; j >= i; j--) {
        //         // System.out.print(j);
        //         // System.out.print(j);
        //     }
        //     System.out.println();
        // }
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
