import java.util.Scanner;

public class covertcase {
    static void convertcase(String S){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c>='A'  && c<='Z') {
                c = (char)(c+ 32);
                str.append(c);
            }
            else{
                c = (char)(c-32);
                str.append(c);
            }
        }
        System.out.println(" String is "+str);
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String S = s.nextLine();
        convertcase(S);
        s.close();
    }
}
