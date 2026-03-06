package Operator;
//used for loop function
/* Types
   1.Increment operator(++)   2.Decrement Operator(--)
      1.Pre increment(++a)       1.Pre decrement(--a)
      2.Post increment (a++)     2.Post decrement(a--)*/
public class UnaryOperator {
    public static void main(String[] args) {
      int a=11;   
      int b=10;
      System.out.println("Pre increment:"+(++a));
      System.out.println("Post incement:"+(a++));
      System.out.println(a);
      System.out.println("Pre decrement:"+(--b));
      System.out.println("Post decement:"+(b--));
      System.out.println(b);
    }
}

/*
 other step:
  int c=30;
  c++;
  System.out.println(c); */
