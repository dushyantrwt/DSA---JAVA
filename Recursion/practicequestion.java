package Recursion;

import Strings.strings;

public class practicequestion {
    static String str[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    public static void main(String[] args) {
        String str = "abcab";
        // int arr[] = {2,2,2,2,2,2,2};
        // question1(arr, 0, 2); 
        // question2(1974);
        // System.out.println(question3(str));
        // System.out.println(question4(str,0,0));
        towerOfHonoi(2, "S","H","D");
    }

    public static void question1(int arr[] , int i, int key ){
        if(i == arr.length){
            return;
        }
        // Kaam
        if(arr[i] == key){
            System.out.print(i+ " ");
        }
        question1(arr, i+1,key);
    } 
    public static void question2(int num){
        if(num == 0){
            return ;
        }
        int lastdigit = num%10;
        question2(num/10);
        System.out.print(str[lastdigit]+ " ");
    } 
    public static int question3(String str){
        if(str.length() == 0){
            return 0;
        }
        return question3(str.substring(1)) + 1;
    } 
    public static int question4(String str,int i ,int j){
        // Base case
        if(i == str.length()){
            return 0;
        }
        // this can increase the value of i by 1 when j reaches the end of string
        if(j == str.length()){
            return question4(str, i+1 ,i+1);
        }

        int ans = 0;

        if(str.charAt(i) == str.charAt(j)){
            ans++;
        }
        return ans + question4(str, i, j+1);
    } 

    public static void towerOfHonoi(int n , String src ,String helper, String dest){
        if(n==1){
            System.out.println("transfer disk " + n + " from " +src + " to " + dest);            
            return ;
        }
        // Shifting n-1 disks to helper tower
        towerOfHonoi(n-1, src, dest, helper);

        // Shifting last disk from source to destination
        System.out.println("transfer disk " + n + "from " +src + " to" + helper);
        // Shifting disk in the helper tower to destination
        towerOfHonoi(n-1, helper, src, dest);
    }
}


