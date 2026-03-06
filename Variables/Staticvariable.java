package Variables;
//if the value of the variable is not varied from object to object then not required to declare the variable as instance
//default value is provided by jvm if we are not performing the initialization
public class Staticvariable {
    static String name="java";//static variable
    static String s;
public static void main(String[] args) {
    System.out.println(Staticvariable.name);
    System.out.println(Staticvariable.s);
}
    
}
