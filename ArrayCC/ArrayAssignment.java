public class ArrayAssignment {
    public static void main(String[] args) {
        // int num[] = {8,9,11,13,15,17,19,21};
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        int height[] = { 0, 1, 0, 3, 1, 0, 1, 3, 2, 1, 2, 1 };
        // int num[] = {-1,0,1,2,-1,-4};
        int num[] = {};
        // System.out.println(checkDuplicacy(num));
        // Question2(num);
        // question3(prices);
        question5(num);
    }

    public static boolean checkDuplicacy(int num[]) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // There is an integer array nums sorted in ascending order (with distinct
    // values).Prior to being passed to your function, nums is possibly rotated at
    // an unknown pivot index k (1 <= k < nums.length) such that the resulting array
    // is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]
    // (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3
    // and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation
    // and an integer target, returnthe index oftarget if it is in nums, or -1 if it
    // is not in nums.You must write an algorithm with O(log n) runtime complexity

    public static void Question2(int num[]) {
        int index = 2;
        int tempindex = index;
        int temp[] = new int[index];
        for (int i = 0; i < index; i++) {
            temp[i] = num[i];
        }
        for (int i = 0; i < num.length - index; i++) {
            num[i] = num[index];
            index++;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        for (int i = 0; i < tempindex; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    public static void question3(int prices[]) {
        int buyprices = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyprices < prices[i]) {
                int profit = prices[i] - buyprices;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprices = prices[i];
            }
        }
        System.out.println("Maximum profit is : " + maxprofit);
    }

    public static void question4(int height[]) {
        int leftmax[] = new int[height.length];
        int rightmax[] = new int[height.length];
        int waterlable[] = new int[height.length];
        int trappedwater = 0;
        int width = 1;
        leftmax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], height[i]);
        }
        rightmax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], height[i]);
        }

        for (int i = 0; i < height.length; i++) {
            waterlable[i] = Math.min(leftmax[i], rightmax[i]);
            trappedwater += (waterlable[i] - height[i]) * width;
        }
        System.out.println("Total trapped water is : " + trappedwater);
    }

    public static void question5(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                for (int k = j + 1; k < num.length; k++) {
                    // if (num[i] != num[j] && num[i] != num[k] & num[j] != num[k]) {
                        if (num[i] + num[j] + num[k] == 0) {
                            System.out.print("[" + num[i] + "," + num[j] + "," + num[k] + "]");
                        }
                    // }
                }
                System.out.print(" ");
            }
        }
    }
}
