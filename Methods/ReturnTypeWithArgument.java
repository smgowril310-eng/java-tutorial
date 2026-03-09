package Methods;

public class ReturnTypeWithArgument {
    public static String demo(String S){
        return S;
    }
    public static String demo(int a,String s1,char c){
       return a+s1+c;
    }
    public static void main(String[] args) {
        System.out.println(demo("Welcome"));
        System.out.println(demo(10,"java",'A'));
    }
}
