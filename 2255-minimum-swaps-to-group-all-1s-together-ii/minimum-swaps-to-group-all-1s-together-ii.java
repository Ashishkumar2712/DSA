class Solution {
    public int minSwaps(int[] nums) {
        
        int n = nums.length;
        int count = 0;

       for (int i=0;i<n;i++){
        if (nums[i]==1) count++;
        
       }
       if (count<=1) return 0;
       int maxones = 0;
       int windowones = 0;
       int left =0;

       for(int right =0; right <n+count; right++){
        windowones += nums[right%n];

        if (right-left+1>count){
            windowones -= nums[left%n];
            left++;
        }
        if (right-left+1 == count ){
            maxones = Math.max(maxones , windowones );
        }
       }
       return count - maxones ;
        
    }
}