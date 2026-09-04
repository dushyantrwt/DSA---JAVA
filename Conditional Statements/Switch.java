import java.util.Scanner;

public class Switch {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        float a = sc.nextFloat();
        System.out.print("Enter number 2 : ");
        float b = sc.nextFloat();
        System.out.print("Enter Operator(+,-,*,/,%) : ");
        char operator = sc.next().charAt(0);
        switch(operator) {
            case '+' : System.out.println("Addition is " + (a+b));
                        break;
            case '-' : System.out.println("Subtraction is " + (a-b));
                        break;
            case '*' : System.out.println("Multiplication is " + (a*b));
                        break;
            case '/' : System.out.println("Division is " + (a/b));
                        break;
            case '%' : System.out.println("Modulus is " + (a%b));
                        break;
            
            default : System.out.println(" Invalid Input ");
        }
    }
}
