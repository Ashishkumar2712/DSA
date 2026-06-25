class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i =0;
        int sum = 0;
        int minlen = Integer.MAX_VALUE ;

        for (int j =0; j<n; j++){
            sum += nums[j];

            while (sum >= target ){
                minlen = Math.min(minlen, j-i+1 );
                sum -= nums[i++];
               
            }
        }
        if (minlen == Integer.MAX_VALUE){
            return 0;
        }
        else {
            return minlen;
        }
    }
}