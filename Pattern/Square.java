public class Square {
    public static void main(String[] args) {
        // for (int i = 0; i < 4; i++) {
        // for (int j = 0; j < 4; j++) {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // for (int i = 0; i < 5; i++) {
        //     for (int j = 1; j <= i + 1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        // for (int i = 0; i < 5; i++) {
        //     for (int j = 5; j > i+1; j--) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || i==n-1 || j==0 || j==n-1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
