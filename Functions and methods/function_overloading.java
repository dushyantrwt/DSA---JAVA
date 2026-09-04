

public class function_overloading{
    public static void main(){
        // int sum = sum(5, 10);
        // System.out.println(sum);
        // double sum1 = sum(5f, 11.006f);
        // System.out.println(sum1);
        // System.out.println(isPrime(3));
        primeinRange(100);
    }
    
    public static int sum(int a , int b){
        int sum = a+b;
        return sum;
    }
    public static float sum(float a , float b ){
        float sum = a+b;
        return sum;
    }

    public static boolean isPrime(int n){
    boolean isPrime = true;
    if(n==2){
        return true;
    }
    for(int i=2 ; i<=Math.sqrt(n); i++){
        if(n%i==0){
            isPrime= false;
            break;
        }
    }
    return isPrime;
}

public static void primeinRange(int n){
    for(int i = 2;i<=n; i++){
        if ( isPrime(i) ){
            System.out.println(i);
        }
    }
}

//     public static boolean isPrime(int n){
//     boolean isPrime = true;
//     if(n==2){
//         return true;
//     }
//     for(int i=2 ; i<n; i++){
//         if(n%i==0){
//             isPrime= false;
//             break;
//         }
//     }
//     return isPrime;
// }
}
