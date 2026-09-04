import java.util.*;

public class spiralMatrix {
    public static void main(String argsString[]){
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,12}};
        int n=matrix.length, m=matrix[0].length;
        // Scanner sc = new Scanner(System.in);
        // for(int i=0; i<n;i++){
        //     for(int j=0; j<m;j++){
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        spirralMatrix(matrix);

    }
    public static void spirralMatrix(int matrix[][]){
        int startRow = 0;
        int startColumn = 0;
        int endRow = matrix.length-1;
        int endColumn = matrix[0].length-1;
        while (startRow<=endRow && startColumn<=endColumn) {
            // for TOP
            for(int j=startColumn; j<=endColumn; j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            // FOR RIGHT
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endColumn]+" ");
            }
            // FOR BOTTTOM
            for(int j=endColumn-1; j>=startColumn; j--){
                if(startColumn == endColumn){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            // FOR LEFT
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[i][startColumn]+" ");
            }

            startColumn++;
            startRow++;
            endColumn--;
            endRow--;
        }
    }

    
} 
