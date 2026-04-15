package constructor;

public class ParameteraisedConstructor {
    String name;
    int age;
    
    // Parameterized constructor
    ParameteraisedConstructor(String n, int a) {
        System.out.println("Parameterized Constructor Called");
        name = n;
        age = a;
    }
    public static void main(String[] args) {
        ParameteraisedConstructor s3 = new ParameteraisedConstructor("Gowri", 22);  // Calls parameterized constructor
        System.out.println(s3.name + " - " + s3.age);
    }
}

