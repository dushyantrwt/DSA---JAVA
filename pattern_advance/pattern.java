package pattern_advance;

import java.util.Scanner;

public class pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int row = sc.nextInt();
        // System.out.print("Enter the no of column: ");
        // int column = sc.nextInt();
        // rotated_pyramid(row, column);
        // hollow_rectangle(row, column);
        // inverted_half_pyramid(row);
        // floyds_triangle(row);
        // _0_1_triangle(row);
        // butterfly(row);
        // solid_rhombus(row);
        // hollow_rhombus(row);
        diamond(row);
    }

     public static void diamond(int row){
        for(int i=1; i<=row;i++){
            //for space
            for(int j=1; j<=row-i;j++){
                System.out.print("  ");
        }
            //for star
            for(int j=1; j<=((2*i)-1);j++){
                System.out.print("* ");
        }
        //for space
            for(int j=1; j<=row-i;j++){
                System.out.print("  ");
        }
        System.out.println();
    }
        for(int i=row; i>=1;i--){
            //for space
            for(int j=1; j<=row-i;j++){
                System.out.print("  ");
        }
            //for star
            for(int j=1; j<=((2*i)-1);j++){
                System.out.print("* ");
        }
        //for space
            for(int j=1; j<=row-i;j++){
                System.out.print("  ");
        }
        System.out.println();
    }
}
    public static void hollow_rhombus(int row){
        for(int i=1; i<=row;i++){
            //for space
            for(int j=1; j<=row-i;j++){
                System.out.print("  ");
        }
            //for stars
            for(int j=1; j<=row;j++){
                if (i == 1 || i == row || j == 1 || j == row){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                } 
        }
        System.out.println();
    }
}
    public static void solid_rhombus(int row){
        for(int i=1; i<=row;i++){
            //for space
            for(int j=1; j<=row-i;j++){
                System.out.print("  ");
        }
            //for stars
            for(int j=1; j<=row;j++){
                System.out.print("* ");
        }
        System.out.println();
    }
}
    public static void butterfly(int row){
        for(int i=1; i<=row;i++){
            //for stars
            for(int j=1; j<=i;j++){
                System.out.print("* ");
        }
            //for space
            for(int j=1; j<=(2*(row-i));j++){
                System.out.print("  ");
        }
        //for stars
            for(int j=1; j<=i;j++){
                System.out.print("* ");
        }
        System.out.println();
    }
        for(int i=row; i>=1;i--){
            for(int j=1; j<=i;j++){
                System.out.print("* ");
        }
            for(int j=1; j<=(2*(row-i));j++){
                System.out.print("  ");
        }
            for(int j=1; j<=i;j++){
                System.out.print("* ");
        }
        System.out.println();
    }
}
    public static void _0_1_triangle(int row){
        for(int i=1; i<=row;i++){
            for(int j=1; j<=i;j++){
                if(isEven(i+j)){
                    System.out.print("1 ");
                }            
                else{
                    System.out.print("0 ");
                }
        }
        System.out.println();
    }
}

    public static boolean isEven(int n){
        boolean isEven =  true;
        if (n % 2 == 0){
            isEven = true;
        }
        else{
            isEven = false;
        }
        return isEven;
    }


    public static void hollow_rectangle(int row , int column){
        for(int i=1; i<=row;i++){
            for(int j=1; j<=column;j++){
                if (i == 1 || i == row || j == 1 || j == column){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }                
            }
            System.out.println();
        }
    }
    public static void rotated_pyramid(int row , int column){
        for(int i=1; i<=row;i++){
            for(int j=1; j<=column;j++){
                if (i+j>=(1+row)){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }                
            }
            System.out.println();
        }
    }
    public static void inverted_half_pyramid(int row){
        for(int i=1; i<=row;i++){
            for(int j=1; j<=row-i+1;j++){
                System.out.print(j);                
            }
            System.out.println();
        }
    }
    public static void floyds_triangle(int row){
        int num=1;
        for(int i=1; i<=row;i++){
            for(int j=1; j<=i;j++){
                System.out.print(num + " ");
                num++;                
            }
            System.out.println();
        }
    }
}
