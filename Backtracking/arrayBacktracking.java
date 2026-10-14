public class arrayBacktracking {

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void changeArr(int arr[],int i, int val){
        // Base Case 
        if(i == arr.length){
            printArr(arr);
            return ;
        }
        // Recursion
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i] - 2;
    }

    public static void findSubset(String str, String ans, int i){
        // BASE CASE
        if(i == str.length()){
            if(ans.length()==0){
                System.out.print("null");
            }else{
                System.out.print(ans+ " ");
            }
            return ;

        }
        // Recursion
        // YES condition
        findSubset(str, ans+str.charAt(i), i+1);
        // No condition
        findSubset(str, ans, i+1);
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        // changeArr(arr, 0, 1);
        // printArr(arr);
        findSubset("abc","", 0);
    }
}
