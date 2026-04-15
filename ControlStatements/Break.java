package ControlStatements;

public class Break{
    public static void main(String[]args){
        //switch
        int num = 2;

switch(num) {
    case 1:
        System.out.println("One");
        break;
    case 2:
        System.out.println("Two");
        break;
    case 3:
        System.out.println("Three");
        break;
        default:
        System.out.println("Not one,two or three");
        break;
}
//loop
        for(int i = 1; i <= 5; i++) {
            if(i == 3) {
                break;
            }
            System.out.println(i);
        }
    }
}
