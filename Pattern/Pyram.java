import java.util.*;  
public class Pyram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);  
        System.out.println("enter the rows: ");
        int m=sc.nextInt();
        // System.out.println(m);
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
            

        }
        sc.close();
    }
}
