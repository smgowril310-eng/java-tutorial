package ControlStatements;
//if else if Ladder
/*if (condition1) {
     runs if condition1 is true
} else if (condition2) {
    runs if condition2 is true
} else if (condition3) {
     runs if condition3 is true
} else {
     runs if all conditions are false
} */
public class ifelseifclass {
    public static void main(String[] args) {
    int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    }
    
}
