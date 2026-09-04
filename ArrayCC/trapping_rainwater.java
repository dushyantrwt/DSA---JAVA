
public class trapping_rainwater {
    public static void main(String[] args) {
        int height[] = { 4,2,6};
        trappingRainwater(height);

    }

    public static void trappingRainwater(int height[]) {
        int maxLeft[] = new int[height.length];
        int maxRight[] = new int[height.length];
        int waterLevel[] = new int[height.length];
        int trappedWater = 0;
        int width = 1;
        // This to check if bars are 3 or more 2 or not
        if (height.length < 3 || height.length == check || height.length == check1) {
            System.out.println("No water can be trapped");
        }

        else {
            // Calculate the left max boundry - array
            maxLeft[0] = height[0];
            for (int i = 1; i < height.length; i++) {
                maxLeft[i] = Math.max(height[i],maxLeft[i-1]);
            }

            // Calculate the right max boundry - array
            maxRight[height.length-1] = height[height.length-1];
            for (int i = height.length-2; i >=0; i--) {
                maxRight[i] = Math.max(height[i],maxRight[i+1]);
            }
            // loop
            for (int i = 0; i < height.length; i++) {
                // waterlable = min(leftmax, rightmax)
                waterLevel[i] = Math.min(maxLeft[i], maxRight[i]);
                // trapped water = (waterLavel - barlavel ) * width
                trappedWater += (waterLevel[i] - height[i]) * width;
            }

            System.out.println("Trapped water between the bars is : " + trappedWater);
        }
    }
}