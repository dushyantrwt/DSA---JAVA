
package Loops;

import java.util.Scanner;

public class for_loop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth term to calculate sum : ");
        int range = sc.nextInt();
        // 
        for(int i=1; i<=range; i++){
            System.out.println("****");
        }
        
    }
}
