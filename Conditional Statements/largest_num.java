import java.util.*;

public class largest_num {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to know the greatest amoung these : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a >= b && a >= c){
            System.out.println(a + " is greatest ");
        }
        else if(b > a && b > c){
            System.out.println(b + " is greatest ");
        }
        
        else{
            System.out.println(c + " is greatest");
        }
    }
}

