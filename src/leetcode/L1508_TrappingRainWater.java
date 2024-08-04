package leetcode;

public class L1508_TrappingRainWater {
    public int trap(int[] height) {
        int waterCounter = 0;
        int lmax = height[0];
        int rmax = height[height.length - 1];
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            if (height[left] < height[right]) {
                if (lmax <= height[left]) {
                    lmax = height[left];
                } else {
                    waterCounter += lmax - height[left];
                }
                left++;
            } else {

                if (rmax <= height[right]) {
                    rmax = height[right];
                } else {
                    waterCounter += rmax - height[right];
                }
                right--;
            }
        }

        return waterCounter;
    }
}
