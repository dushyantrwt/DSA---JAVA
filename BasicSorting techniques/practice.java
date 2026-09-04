import java.util.*;

public class practice {
    public static void main(String[] args) {
        Integer num[] = {3,6,2,-1,8,7,4,5,-3,1};
        Arrays.sort(num);
        printarr(num);
        System.out.println();
        Arrays.sort(num,Collections.reverseOrder());

        printarr(num);
        // bubbleSort(num);
        // selectionSort(num);
        // insertionSort(num);
    }

    // public static void insertionSort(int num[]){
    //     for(int i=1; i<num.length; i++){
    //         int curr = num[i];
    //         int prev = i-1;
    //         while (prev>=0 && num[prev] < curr) {
    //             num[prev+1] = num[prev];
    //             prev--;
    //         }
    //         num[prev+1]= curr;
    //     }

    //     printarr(num);
    // }

    // public static void selectionSort(int num[]){
    //     for(int i=0; i<num.length; i++){
    //         int minpos = i;
    //         for(int j=i+1; j<num.length; j++){
    //             if(num[minpos] < num[j]){  // by just changing the greather than sign we can sort array in increasing pr decreasing order
    //                 minpos = j;
    //             }
    //         }
    //         int temp = num[minpos];
    //         num[minpos] = num[i];
    //         num[i] = temp;
    //     }
    //     printarr(num);
    // }

    // public static void bubbleSort(int num[]){
    //     for(int i=0; i<num.length-1; i++){
    //         for(int j =0; j<num.length-1-i; j++){
    //             if(num[j] < num[j+1]){  // by just changing the greather than sign we can sort array in increasing pr decreasing order
    //                 int temp = num[j];
    //                 num[j] = num[j+1];
    //                 num[j+1] = temp;
    //             }
    //         }
    //     }
    //     printarr(num);
    // }

    public static void printarr(Integer array[]){
        for(int i =0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }
}
