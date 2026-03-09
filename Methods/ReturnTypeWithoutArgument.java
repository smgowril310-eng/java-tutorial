package Methods;

public class ReturnTypeWithoutArgument {
    public int sub(){
    int c=20;
    return c;
}
public static void main(String[] args) {
    ReturnTypeWithoutArgument obj=new ReturnTypeWithoutArgument();
    System.out.println(obj.sub());
}
}
