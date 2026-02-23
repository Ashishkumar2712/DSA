class Solution {
    public int jump(int[] nums) {
        int j =0;
        int n = nums.length;
        int[] dp = new int[n];

        for (int i = 0; i<n; i++)
        dp[i] =Integer.MAX_VALUE;

        dp[0] = 0;
        for (int i =0; i<n; i++){
            for (j =0; j <= i + nums[i] && j < n; j++){
                dp[j] = Math.min(dp[j], dp[i]+1);
            }
        }
        return dp[n-1];

    }
}