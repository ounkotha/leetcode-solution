package leetcode;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int n = height.length;
        int L = 0, R = n - 1, m = Integer.MIN_VALUE;

        while (L < R) {
            int res = (R - L) * Math.min(height[L], height[R]);
            m = Math.max(m, res);
            if(height[L] < height[R]) {
                L++;
            } else {
                R--;
            }
        }
        return m;
    }

}
