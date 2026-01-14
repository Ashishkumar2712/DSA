class Solution {
    public int maxCoins(int[] nums) {
         int[][] DP = new int[nums.length][nums.length];
		for (int gap = 0; gap < DP.length; gap++) {
			for (int i = 0, j = gap ; j < DP.length; i++, j++) {
				int max = 0;
				for (int k = i; k <= j; k++) {
					int left = i==k?0: DP[i][k-1];
					int right = j==k?0: DP[k+1][j];
					int mid = (i==0?1:nums[i-1]) * nums[k] * (j==nums.length-1?1:nums[j+1]);
					max = Math.max(max, left + mid + right);
				}
				DP[i][j] = max;
			}
		}
		return DP[0][DP.length-1];
    }
}