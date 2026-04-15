package ControlStatements;
/*if (condition1) {
    if (condition2) {
         runs if both condition1 and condition2 are true
    else{
         runs if condition2 is false   
        }
  else{
         runs if condition1 is false
      }
} */

public class nestedifclass {
    public static void main(String[] args) {
    int marks = 85;
if (marks >= 50) {
    if (marks >= 80) {
        System.out.println("Distinction");
    } else {
        System.out.println("Pass");
    }
} else {
    System.out.println("Fail");
}
    }
    
}
