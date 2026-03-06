package Operator;
// three variables use -->it returns boolean value  
// two variables use -->it returns number
/* three operator:
   1.&
   2.|
   3.^ */
public class BitwiseOperator {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        System.out.println(a<b&b>c);
        System.out.println(a<b|b>c);
        System.out.println(a<b^b>c);
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
    }
}
