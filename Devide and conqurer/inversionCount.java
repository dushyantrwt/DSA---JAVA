public class inversionCount {

    public static int merge(int arr[],int left, int mid, int right){
        int temp[] = new int[right-left+1];
        int i=left;
        int j= mid+1;
        int k = 0;
        int invCount = 0;
        while(i<=mid && j<=right){
            if(arr[i]>arr[j]){
                temp[k] = arr[j];
                invCount += mid - i+1;
                j++;
            }
            else{
                temp[k] = arr[i];
                i++;
            }
            k++;
        }

        while (i<=mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j<=right) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for(i=left,k=0;k<temp.length;i++,k++){
            arr[i] = temp[k];
        }
        return invCount;
    }

    public static int mergeSort(int arr[],int left, int right){
        int invCount = 0;
        if(right>left){
            int mid = (left+right) / 2;
            invCount = mergeSort(arr, left, mid);
            invCount += mergeSort(arr, mid+1, right);
            invCount += merge(arr, left, mid, right);
        }
        return invCount;
    }


    public static int getInversion(int arr[]){
        int n = arr.length;
        return mergeSort(arr, 0, n-1);
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,1};
        System.out.println(getInversion(arr));
    }
}