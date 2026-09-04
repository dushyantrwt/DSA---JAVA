// package Functions and methods;
import java.util.*;

public class function_demo {
    public static void main(String args[]){
        // printHelloworld();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum2 = calculateSum(a,b);  // arguments or actual parameters
        System.out.println("Sum is " + sum2);
    }

    public static int calculateSum(int num1 , int num2){   //parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }

    public static void printHelloworld(){
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        return ;
    }
}
