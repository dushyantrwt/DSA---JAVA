import java.util.*;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int row = sc.nextInt();
        // System.out.print("Enter the no of column: ");
        // int column = sc.nextInt();
        // rotated_pyramid(row, column);
        // hollow_rectangle(row, column);
        // inverted_half_pyramid(row);
        floyds_triangle(row);
    }


    public static int integerSum(int num){
        int lastDigit = 0;
        int sum = 0;
        while (num>0) {
            lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }
        return sum;
    }

    public static float Average (int a , int b, int c){
        float Avg = (float)(a+b+c)/3;
        return Avg;
    }
    
    public static boolean ispalindrome (int n){
        boolean isPalindrome = true;
        int num = n;
        int palindrome = 0;
        int remender = 0;
        while (n>0) {
            remender = n % 10;
            palindrome = palindrome * 10 + remender;
            n = n/10;
        }
        if(num ==  palindrome){
            isPalindrome = true;
        }
        else{
            isPalindrome = false;
        }
        return isPalindrome;
    }
    public static boolean isEven (int num){
        boolean isEven = true;
        if(num % 2 != 0){
            isEven = false;
        }
        return isEven;
    }

}
