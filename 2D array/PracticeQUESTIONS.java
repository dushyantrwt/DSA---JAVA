import java.util.*;

public class PracticeQUESTIONS {
    public static void main(String[] args) {
        int matrix[][] = {{77,20,30,40},
                          {15,25,7,45}
                        //   {77,29,37,48},
                        //   {32,33,7,7}
                         };
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter key to search : ");
        // int key = sc.nextInt();
        int n=matrix.length, m=matrix[0].length;
        for(int i=0; i<m;i++){
            for(int j=0; j<n;j++)
                System.out.print(matrix[j][i]+" ");
            
            System.out.println();
        }
        // question1(matrix);
        // question2(matrix);
    }

    public static void question1(int matrix[][]){
        int count = 0;
        int n=matrix.length, m=matrix[0].length;
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                if(matrix[i][j] == 7){
                    count++;
                }
            }
        }
        System.out.println("7 is present " + count + " times in the matrix");
    }

    public static void question2(int matrix[][]){
        int sum = 0;
        for(int i=0; i<matrix[0].length;i++){
            sum += matrix[1][i];
        }
        System.out.println("Sum of the 2 row of the given matrix " + sum);
    }
}
