import java.util.Scanner;
public class Example {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter integer: ");
        //nextInt()
        int num = scan.nextInt();

        System.out.println("You entered: " + num);
        //nextFloat()
        System.out.print("Enter Float: ");
        float num2= scan.nextFloat();
        System.out.println("Float: " + num2);
        //nextLong()
        System.out.print("Enter Long: ");
        long num3 = scan.nextLong();
        System.out.println("Long: " + num3);
        //nextDouble()
        System.out.print("Enter Double: ");
        double num4 = scan.nextDouble();
        System.out.println("Double: " + num4);
        //nextBoolean()
        System.out.print("Enter Boolean: ");
        boolean val = scan.nextBoolean();
        System.out.println("Boolean: " + val);
        //next()
        System.out.print("Enter next: ");
        String word = scan.next();
        System.out.println("Word: " + word);
        //nextLine()
        System.out.print("Enter Line: ");
        String line = scan.nextLine();
        System.out.println("Line: " + line);
        //hasNext()
        System.out.print("Enter Next: ");
        if(scan.hasNext()) {
        System.out.println("Input available");
        }
        //hasNextInt()
        System.out.print("Enter NextInt: ");
        if(scan.hasNextInt()) {
        int num5 = scan.nextInt();
        System.out.println(num5);
        } 
        else {
        System.out.println("Not an integer");
        }
        //hasNextFloat()
        System.out.print("Enter NextFloat: ");
        if(scan.hasNextFloat()) {
        float f = scan.nextFloat();
        System.out.println(f);
        }
        //charAt()
        System.out.print("Enter character: ");
        char c = scan.next().charAt(0);
        System.out.println("Character: " + c);
    }
}

