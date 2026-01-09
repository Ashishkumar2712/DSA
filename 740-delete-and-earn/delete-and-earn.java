class Solution {
    public int deleteAndEarn(int[] nums) {
       int maxVal = 0;
        for (int num : nums) maxVal = Math.max(maxVal, num);

        int[] points = new int[maxVal + 1];
        for (int num : nums) {
            points[num] += num;
        }

        // House Robber with O(1) space
        int prev2 = 0; // dp[i-2]
        int prev1 = 0; // dp[i-1]

        for (int i = 0; i <= maxVal; i++) {
            int curr = Math.max(prev1, prev2 + points[i]);
            prev2 = prev1;
            prev1 = curr;
        }
        
        return prev1;
    }
}