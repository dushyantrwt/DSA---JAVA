// printing the reverse of a number 

package Loops;

import java.util.Scanner;



// public class reverse {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number to get reverse : ");
//         int num = sc.nextInt();
//         int rev = 0;
//         int lastdigit = 0;
//         while(num > 0){
//             lastdigit = num % 10;
//             rev = (rev * 10) + lastdigit;
//             num = num / 10;
//         }
        
//         System.out.println(rev);
//     }
// }



public class reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth term");
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
            if((i%3) == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
