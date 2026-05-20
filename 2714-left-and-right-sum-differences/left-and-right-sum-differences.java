class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int j =0;

        for (int i = 0; i<n; i++){
            j += nums[i];
            }


            int k=0;
            int l = 0;
    

            for (int i=0; i<n; i++){
                l = nums[i];
                j = j-l;
                nums[i] = Math.abs(k-j);
                k += l;
            }
            return nums ;


             
            


        
    }
}