package Patterns;

// public class nexted_loop {
//     public static void main(String args[]){
//         for(int line=1; line<=10;line++){
//             for(int star=1; star<=line;star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// public class nexted_loop {
//     public static void main(String args[]){
//         int n = 5;
//         for(int line=n; line>=1;line--){
//             for(int star=1; star<=line;star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



public class nexted_loop {
    public static void main(String args[]){
        char ch = 'A';
        for(int line=1; line<=4;line++){
            for(int star=1; star<=line;star++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}