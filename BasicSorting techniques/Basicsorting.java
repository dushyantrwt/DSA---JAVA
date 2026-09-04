import java.util.*;

public class Basicsorting {
    public static void main(String[] args) {
        int num[] = {1,4,1,3,2,4,3,7};
        // Arrays.sort(num,1,5);
        // printArr(num);
        countingSort(num);

        // bubbleSort(num);
        // selectionSort(num);
        // insertionSort(num);
    }

    public static void printArr(int num[]){
        for(int i=0; i<num.length;i++){
            System.out.print(num[i] + " ");
        }
    }
    public static void bubbleSort(int nums[]) {
        int swap = 0;
        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swap++;
                }

            }
            if (swap == 0) {
                System.out.println("Array is already sorted");
                break;
            }
        }

        if (swap > 0) {
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
        }
    }

    public static void selectionSort(int nums[]){
        for(int i = 0; i<nums.length-1;i++){
            int minPos = i;
            for(int j = i+1; j<nums.length;j++){
                if( nums[minPos] < nums[j] ){
                    minPos = j;
                }
            }
            int swap = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = swap;

        }
        for(int i=0; i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void insertionSort(int nums[]){
        for(int i=1; i<nums.length;i++){
            int curr = nums[i];
            int prev = i-1;
            while (prev >=0 && nums[prev] > curr) {
                nums[prev+1] = nums[prev];
                prev--;
            }

            nums[prev+1] = curr;
        }

        for(int i=0; i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void countingSort(int num[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<num.length;i++){
            largest = Math.max(largest, num[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<num.length;i++){
            count[num[i]]++;
        }
        int j = 0;
        for(int  i =0;i<count.length;i++){
            while (count[i] > 0) {
                num[j] = i;
                j++;
                count[i]--;
            }
        }
        printArr(num);
    }
}
