package Recursion;

public class Recursionbasics {
    public static void main(String[] args) {
        int n = 35;
        int key = 5;
        int arr[] = {2,5,6,1,10,21,6,44};
        // System.out.println(firstOccurance(arr, key,0));
        // System.out.println(lastOccurance2(arr, key,arr.length-1));
        System.out.println(printXtoPowerN1(2, 30));
        // System.out.println(isSorted(arr,2));
        // printdec(n);
        // printinc(n);
        
        // System.out.println("factorial = " + factorial(n));
        // System.out.println("Fibo = " + fibonacci(n));
        // System.out.println(n);
    }

    public static int printXtoPowerN(int x ,int n){
        if(n == 0){
            return 1;
        }
        return x * printXtoPowerN(x, n-1);
    }
    public static double printXtoPowerN1(int x ,int n){  //Optimised 
        if(n==0){
            return 1;
        }
        double power = printXtoPowerN1(x, n/2);
        double halfpowersq = power * power;
        if(n % 2 != 0){
            halfpowersq = x * power * power;
        }
        return halfpowersq;
    }


    public static int firstOccurance(int arr[], int key,int i){
        if (i == arr.length) {
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurance(arr, key, i+1);
    }
    public static int lastOccurance(int arr[], int key,int i){
        if (i == -1) {
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lastOccurance(arr, key, i-1);
    }
    public static int lastOccurance2(int arr[], int key,int i){
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurance2(arr, key, i-1);
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        return  isFound;
    }
    public static boolean isSorted(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int fibonacci(int n){
        int fibo;
        if(n == 0 || n ==1){
            return n;
        }
        fibo = fibonacci(n-1) + fibonacci(n-2);
        return fibo;
    }

    public static void printdec(int n){
        if( n == 1){
            System.out.println(n+" ");
            return;
        }
        System.out.print(n+" ");
        printdec(n-1);
    }
    public static void printinc(int n){
        if( n == 1){
            System.out.print(n+" ");
            return;
        }
        printinc(n-1);
        System.out.print(n+" ");
    }
    public static int factorial(int n){
        if( n == 1){
            return 1;
        }
        int factorial = n * factorial(n-1);
        return factorial;
    }
    public static int sum(int n){
        if( n == 1){
            return 1;
        }
        int Sum = n + sum(n-1);
        return Sum;
    }
}
