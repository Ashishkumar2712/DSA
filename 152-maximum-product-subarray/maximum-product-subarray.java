class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int suff = 0;
        int pre = 0;
        int product = 0;
        int max = Integer.MIN_VALUE;


        for (int i=0; i<n; i++){
            if (pre ==0) pre =1;
            if (suff ==0) suff =1 ;
             
             pre *= nums[i];
             suff *= nums[n-i-1];

             product = Math.max(pre, suff);
             max = Math.max(max , product );
        }
        return max ;
        
    }
}