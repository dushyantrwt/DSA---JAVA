package ArrayCC;

// import java.util.Scanner;

public class ArrayCC {
    public static void main(String args[]) {
        int numbers[] = { -2, -3, -4, -8, -2, -9, -5, -3 };
        // Scanner sc = new Scanner(System.in);
        // int key = sc.nextInt();
        // int index = linearSearch(numbers, key);
        // if(index == -1){
        // System.out.println("key is not present in the Available array");
        // }
        // else{
        // System.out.println("key is present in the index : " + index);
        // }
        // largest(numbers);

        // int index = binarySearch(numbers, key);
        // if(index == -1){
        // System.out.println("key is not present in the Available array");
        // }
        // else{
        // System.out.println("key is present in the index : " + index);
        // }

        // reverseArray(numbers);
        // for(int i=0; i<numbers.length;i++){
        // System.out.print(numbers[i] + " ");
        // }
        // System.out.println();
        // pairsinArray(numbers);
        // continuosArray(numbers);
        // MaxSubarraySum(numbers);
        // PrifixMaxSubarraySum(numbers);
        kedaneMaxSubarraySum(numbers);
    }

    public static void kedaneMaxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = 0;
        int point = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                point++;
            }
        }

        if (numbers.length == point) {
            PrifixMaxSubarraySum(numbers);
        } else {
            for (int i = 0; i < numbers.length; i++) {
                currSum = currSum < 0 ? currSum = 0 : currSum + numbers[i];
                maxSum = Math.max(currSum, maxSum);
            }
            System.out.println("Maximum subarray is : " + maxSum);
        }

    }

    // This is most optimal code for finding max subarray sum but in case if all the
    // elements in array is negative than it give max equal to 0 instead of minimum
    // negative number

    // public static void kedaneMaxSubarraySum(int numbers[]){
    // int currSum = 0;
    // int maxSum = 0;
    // for(int i = 0; i<numbers.length; i++){
    // currSum = currSum < 0 ? currSum = 0: currSum + numbers[i];
    // maxSum = Math.max(currSum,maxSum);
    // }
    // System.out.println("Maximum subarray is : " + maxSum);
    // }

    public static void PrifixMaxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxarr = Integer.MIN_VALUE;

        // Prefix Array
        int prifix[] = new int[numbers.length];
        prifix[0] = numbers[0];
        for (int i = 1; i < prifix.length; i++) {
            prifix[i] = prifix[i - 1] + numbers[i];
        }
        for (int i = 0; i < prifix.length; i++) {
            for (int j = i; j < prifix.length; j++) {
                currSum = i == 0 ? prifix[j] : prifix[j] - prifix[i - 1];
                if (maxarr < currSum) {
                    maxarr = currSum;
                }
            }
        }
        System.out.println("Maximum sub array is : " + maxarr);
    }

    public static void MaxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxarr = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int z = i; z <= j; z++) {
                    currSum += numbers[z];

                }
                if (maxarr < currSum) {
                    maxarr = currSum;
                }
                System.out.println(currSum);
                currSum = 0;
            }
            // System.out.println();
        }
        System.out.println("Maximum sub array is : " + maxarr);
    }

    public static void continuosArray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int z = i; z <= j; z++) {
                    System.out.print(numbers[z] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static int largest(int sum) {
        int largest = Integer.MIN_VALUE;
        if (sum > largest) {
            largest = sum;
        }

        // System.out.println("Largest sum is : "+ largest);
        return largest;
    }

    public static void pairsinArray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ")");

            }
            System.out.println();
        }
    }

    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] > key) {
                end = mid - 1;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void reverseArray(int numbers[]) {
        int first = 0;
        int last = numbers.length - 1;
        while (first < last) {
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;
            first++;
            last--;
        }
    }

    public static void largest_in_array(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        // int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            // if (numbers[i] < smallest){
            // smallest = numbers[i];
            // }
        }
        // System.out.println("Smallest value is " + smallest);
        System.out.println("largest value is " + largest);
        // return largest;
    }

    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void update(int marks[], int nonchangable) {
        nonchangable = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
}