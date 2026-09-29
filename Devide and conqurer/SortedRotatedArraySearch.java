public class SortedRotatedArraySearch{
    // Recursion format
    public static int arraySearch(int arr[],int target, int si, int ei){
        // Base Case
        if(si > ei){
            return -1;
        }
        // Kaam
        int mid = si + (ei-si)/2;
        if(arr[mid] == target){
            return mid;
        }

        // Mid on line 1
        if(arr[si]<arr[mid]){
            // Case a : left
            if(arr[si]<=target && target<=arr[mid]){
                return arraySearch(arr, target, si, mid-1);
            }
            // case b : right
            else{
                return arraySearch(arr, target, mid+1, ei);
            }
        }
        // Mid on line 2
        else{
            if(arr[mid]<=target && target<=arr[ei]){
                return arraySearch(arr, target, mid+1, ei);
            }
            else{
                return arraySearch(arr, target, si, mid-1);
            }
        }
    }

    // Iteration Format

    public static int arraySearch(int arr[],int target,int si, int ei){
        while (si <= ei) {
            // Element Found
            int mid = si + (ei - si) / 2;
            if(arr[mid] == target){
            return mid;
            }

            if(arr[si]<arr[mid]){
                if(arr[si]<=target && target<=arr[mid]){
                    ei = mid-1;
                }
                else{
                    si = mid + 1; 
                }
            }
            else{
                if(arr[mid]<=target && target<=arr[ei]){
                    si = mid+1;
                }
                else{
                    ei = mid-1;
                }
            } 
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(arraySearch(arr,target,0,arr.length-1));
    }
}