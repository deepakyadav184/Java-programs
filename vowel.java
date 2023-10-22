import java.util.Scanner;

public class vowel {
    static void isVowel(char ch){
        if (ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o'|| ch == 'u') {
            System.out.println("It is a vowel");
        } else {
            System.out.println("It is not a vowel ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character to check: ");
        char ch = sc.next().charAt(0);
        isVowel(ch);
        
        sc.close();
    }
}
