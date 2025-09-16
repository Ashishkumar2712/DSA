class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int distance =0;
        int j = n-1;

        for(int i =0; i<n; i++){
            if (i> distance ){
                return false ;

            }
            distance = Math.max(distance, i+nums[i]);
            }
            return true ;
        }
}       
       

        
