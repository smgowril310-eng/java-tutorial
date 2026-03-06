package Variables;
//if the value of the variable varied from object to object
//instance variable is also kown as attributes or object level variables
//default value is provided by jvm if we are not performing the initialization
public class Instancevariable {
    int a=100;//instance variable
    public static void main(String[]args)
    {
        Instancevariable obj=new Instancevariable();
        System.out.println(obj.a);
    }
}
