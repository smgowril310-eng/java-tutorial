package Methods;

public class NonReturnTypeWithoutParameter {
    public void add(){
        int a=10;
        int b=20;
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        System.out.println(Math.max(20, 10));
        System.out.println(Math.min(20, 10));
        NonReturnTypeWithoutParameter obj=new NonReturnTypeWithoutParameter();
       obj.add();
    }
}
