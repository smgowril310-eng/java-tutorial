package Methods;

/*Variable  Methods
 instance - instance
 instance - static(object reference)
 static   - instance
 static   - static */

 class sample{
    int id=123;
    static String name="user";
    public void add(){
        System.out.println("instance method:"+id+" "+name);
    }
    public static String demo(String S){
        sample obj=new sample();
        System.out.println("Static method:"+obj.id+""+name);
        return S;
    }
 }

public class MethodVariableRelation {
 public static void main(String[] args) {
    sample ob=new sample();
    ob.add();
    System.out.println(sample.demo("hiii"));
 }   
}
