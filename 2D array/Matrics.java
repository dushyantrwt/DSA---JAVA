import java.util.*;

public class Matrics {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int key = 3;
        int n = matrix.length, m=matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        // search(matrix, key);
        Max(matrix);
    } 



    public static void Max(int matrix[][]){
        int maximum = Integer.MIN_VALUE;
        int n = matrix.length, m=matrix[0].length;
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                maximum = Math.max(maximum, matrix[i][j]);
            }
        }
        System.out.println("Maximum elemnt of 2D array is :" + maximum);
    }

    public static boolean search(int matrix[][], int key){
        int n = matrix.length, m=matrix[0].length;
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                if(matrix[i][j] == key){
                    System.out.println("Found at cell : " + i +"," + j);
                    return true;
                }
            }
        }
        System.out.println("Key is not found");
        return false;
    }
}
