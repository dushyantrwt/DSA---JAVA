public class DiagonalSum {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},
                          {5,6,7},
                          {9,10,11}
                          };
        int n=matrix.length, m=matrix[0].length;
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++)
                System.out.print(matrix[i][j]+" ");
            
            System.out.println();
        }
        diagonalSum(matrix);
    }

    public static void diagonalSum(int matrix[][]){
        int n=matrix.length, m=matrix[0].length;
        int primarySum = 0;
        int secondarySum = 0;
        // 
        
        for(int i = 0; i<n;i++){
            // for primary SUM
            primarySum += matrix[i][i];

            // for secondary SUM
            secondarySum += matrix[i][n-i-1];
        }
     
        System.out.println(primarySum);
        System.out.println(secondarySum);
        int DiagonalSum = primarySum + secondarySum;
        System.out.println(DiagonalSum);
    }
}
