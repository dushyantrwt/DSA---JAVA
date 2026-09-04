import java.util.*;

public class searchMatrixSorted {
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}
                         };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key to search : ");
        int key = sc.nextInt();
        int n=matrix.length, m=matrix[0].length;
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++)
                System.out.print(matrix[i][j]+" ");
            
            System.out.println();
        }
        staircaseSearch(matrix, key);
    }

    public static boolean staircaseSearch(int matrix[][], int key){
        int row = matrix.length-1, col = 0;

        while (row >=0 && col <=matrix[0].length-1) {
            if (key == matrix[row][col]) {
                System.out.println("key found at index ("+ row + ","+ col+")");
                return true;
            }
            else if(key < matrix[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("Key doesnt exixt");
        return false;
    }


    public static boolean brotuForceSearch(int matrix[][], int key){
        int n=matrix.length, m=matrix[0].length;
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                if(matrix[i][j] == key){
                    return true;
                }
            }
        }
        return false;
    }
}