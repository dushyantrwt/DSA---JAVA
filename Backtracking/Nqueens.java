class Nqueens {
    public static void printBoard(char board[][]) {
        System.out.println("------ Chess Board -------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // public static boolean isSafe(char board[][], int row, int col) {
    //     // Vertical Up
    //     for (int i = row - 1; i >= 0; i--) {
    //         if (board[i][col] == 'Q') {
    //             return false;
    //         }
    //     }
    //     // Left Diagonal
    //     for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
    //         if (board[i][j] == 'Q') {
    //             return false;
    //         }
    //     }
    //     // Right Diagonal
    //     for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
    //         if (board[i][j] == 'Q') {
    //             return false;
    //         }
    //     }
    //     return true;
    // }




    // N queens solution to print the total solutions possible
    // public static void nQueens(char board[][], int row) {
    //     // Base Case
    //     if (row == board.length) {
    //         printBoard(board);
    //         return;
    //     }
    //     // Recursion
    //     for (int j = 0; j < board.length; j++) {
    //         if (isSafe(board, row, j)) {
    //             board[row][j] = 'Q';
    //             nQueens(board, row + 1);
    //             board[row][j] = 'X';
    //         }
    //     }
    // }



    // N Queens solution to print the total no of solution possible
    // public static void nQueens(char board[][], int row) {
    //     // Base Case
    //     if (row == board.length) {
    //         count++;
    //         return;
    //     }
    //     // Recursion
    //     for (int j = 0; j < board.length; j++) {
    //         if (isSafe(board, row, j)) {
    //             board[row][j] = 'Q';
    //             nQueens(board, row + 1);
    //             board[row][j] = 'X';
    //         }
    //     }
    // }


    // N Queens solution to print only one solution if possible
    // public static boolean nQueens(char board[][], int row) {
    //     // Base Case
    //     if (row == board.length) {
    //         return true;
    //     }
    //     // Recursion
    //     for (int j = 0; j < board.length; j++) {
    //         if (isSafe(board, row, j)) {
    //             board[row][j] = 'Q';
    //             if(nQueens(board, row + 1)){
    //                 return true;
    //             }
    //             board[row][j] = 'X';
    //         }
    //     }
    //     return false;
    // }
    public static boolean isSafe(char board[][], int row, int col){
        // Vertical Up
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // Left Diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // Right Diagonal
        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char board[][],int row){
        // Base Case
        if(row == board.length){
            printBoard(board);
            return;
        }
        // Recursion
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row,j)){
                board[row][j] = 'Q';
                nQueens(board, row+1);
                board[row][j] = 'X';
            }
        }
    }

    static int count=0;
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nQueens(board, 0);
        // if(nQueens(board, 0)){
        //     System.out.println("Solution is possible");
        //     printBoard(board);
        // }else{
        //     System.out.println("No solution is possible");
        // }
        // System.out.println("Total no of ways for nQueens = "  + count);
    }
}