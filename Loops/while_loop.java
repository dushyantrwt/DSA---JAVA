package Loops;

import java.util.Scanner;

public class while_loop {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth term to print numbers : ");
        int counter = sc.nextInt();
        int i = 1;
        while(i<=counter){
            System.out.println(i + " Hello world") ;
            i++;
        }
    }
}
