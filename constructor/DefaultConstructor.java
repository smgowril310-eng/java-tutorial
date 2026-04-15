package constructor;
public class DefaultConstructor{
    int id;
    String name;
    public static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor();
        System.out.println(obj.id);
        System.out.println(obj.name);
    }
}