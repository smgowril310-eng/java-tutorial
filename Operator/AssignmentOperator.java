package Operator;
/* Seven operator:
   1.+=
   2.-=
   3.*=
   4./=
   5.<<=
   6.>>=
   7.= */
public class AssignmentOperator {
   public static void main(String[] args) {
    int a=10;
    System.out.println(a+=20);//a=10+20=30
    System.out.println(a-=20);//a=10-20=10
    System.out.println(a*=20);//a=10*20=200
    System.out.println(a/=20);//a=10/20=10
    System.out.println(a<<=20);//a=10<<20=10485760
    System.out.println(a>>=20);//a=10>>20=10
    System.out.println(a=20);//a=20
   } 
}
