import java.util.Scanner;
public class mathematicaloperations{
    public static void main(String[]args){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:");
        a=sc.nextInt();
        System.out.print("Enter the second number:");
        b=sc.nextInt();
        System.out.print("enter a operator:");
        String op=sc.next();
        switch(op){
            case "+":
                System.out.println("sum of a and b ="+(a+b));
                break;
            case "-":
                System.out.println("difference of a and b ="+(a-b));
                break;
            case "*":
                System.out.println("product of a and b="+(a*b));
                break;
            case "/":
                System.out.println("quotient of a and b="+(a/b));
                break;
            case "%":
                System.out.println("remainder of a and b="+(a%b));
                break;
            default:
                System.out.println("invalid operator");
        }
    }
}
