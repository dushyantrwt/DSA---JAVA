

public class gridways {

    // public static int countways(int i,int j,int n, int m){
    //     // Base case
    //     if(i==n-1 && j==m-1){
    //         return 1;
    //     }else if(i == n || j==m){
    //         return 0;       
    //     }
    //     // Recursion
    //     int w1 = countways(i+1,j,n, m); 
    //     int w2 = countways(i,j+1,n, m);
    //     return w1 + w2;
    // }
    public static void main(String[] args) {
        int n = 10;
        int m =10;
        System.out.println("Total no of ways = " + countways(n, m));
    }

    public static long factorial(int n){
        long fact=1;
        for(int i=n; i>=1;i--){
            fact *= i;
        }
        return fact;
    }
    public static long countways(int n, int m){
        long totalways = factorial((n-1) + (m-1))/ (factorial(n-1) * factorial(m-1));
        return totalways;
    }
}
