package Methods;

public class NonReturnTypeWithArgument {
     public void add(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        System.out.println(Math.max(20, 10));
        System.out.println(Math.min(20, 10));
       NonReturnTypeWithArgument obj=new NonReturnTypeWithArgument();
       obj.add(10,20);
    }
}
