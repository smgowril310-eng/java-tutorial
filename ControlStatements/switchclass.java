package ControlStatements;
/*switch (expression) {
    case value1:
        code
        break;

    case value2:
         code
        break;

    case value3:
         code
        break;

    default:
         runs if no case matches
} */

public class switchclass {
     public static void main(String[] args) {
        int day = 7;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Fridayday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }  
}
