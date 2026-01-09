class Solution {
    public int deleteAndEarn(int[] nums) {
      /* int maxVal = 0;
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
}*/


int n = nums.length;
if (n==0){
    return 0;
}
    int[] val = new int[10001];
    for (int num:nums){
        val[num] += num;
    }

    int prv1 = 0;
    int prv2 = 0;

    for (int value: val){
        int temp = prv1;
        prv1 = Math.max(prv2 + value , prv1);
        prv2 = temp;
    }
    return prv1;
}

}
