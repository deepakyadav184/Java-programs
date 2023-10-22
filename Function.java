public class Function {
    //function with no parameters and written type
    static void add(){
        int a =10;
        int b =10;
        int c =a+b;
        System.out.println(" sum is: "+c);
    }
    
    //fn with parameters no return type
    static void add2(int x, int y){
        int a =x;
        int b =y;
        int c =a+b;
        System.out.println(" sum is: "+c);
    }
    //fn with parameters and return type
    static int add3(int x, int y){
        int a =x;
        int b =y;
        int c =a+b;
        return c;
    }

    public static void main(String[] args) {
        add();
        add2(5,6);
        int res = add3(50,60);

    }
}