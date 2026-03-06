package Operator;
// it returns boolean value
/* Two operator:
    1.&& -->it will return true if both condition are true
    2.|| -->it will return true if any one condition is true*/
public class LogicalOperator {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        System.out.println(a<b&& b<c);
        System.out.println(a>b&&b>a);
        System.out.println(a<b||b<c);
        System.out.println(a>b||b>a);
    }
}
