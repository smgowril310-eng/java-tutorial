package constructor;

public class NoArgumentConstructor {
    String name;
    int age;
    
    // No-argument constructor
    NoArgumentConstructor() {
        System.out.println("No-Argument Constructor Called");
        name = "Guest";
        age = 18;
    }
    public static void main(String[] args) {
        NoArgumentConstructor s2 = new NoArgumentConstructor();  // Calls no-argument constructor
        System.out.println(s2.name + " - " + s2.age);
    }
}

