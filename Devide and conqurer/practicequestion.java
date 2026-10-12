
public class practicequestion {

    public static void printArr(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(String arr[], int si, int ei) {
        // Base case
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) < 0) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static int question2(int arr[]){
        int count = 0;
        int candiate = 0;
        for(int num : arr){
            if(count == 0){
                candiate = num;
            }
            if(num == candiate){
                count++;
            }else{
                count--;
            }
        }
        return candiate;
    }

    public static void main(String[] args) {
        // String arr[] = { "sun", "earth", "mars", "mercury" };
        // mergeSort(arr, 0, arr.length - 1);
        // printArr(arr);
        // int arr[] = {2,2,1,1,1,2,2};
        // System.out.println(question2(arr));

    }

}
