
// Sum of first n natural numbers using while loop\

package Loops;

import java.util.Scanner;

public class sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth term to calculate sum : ");
        int range = sc.nextInt();
        int counter = 1;
        int sum = 0;
        while(counter<=range){
            sum += counter;
            counter++;
        }
        System.out.println(sum);
    }
}
