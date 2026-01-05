class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1)return nums[0];
        
        int one = HouseRobberOne(nums,0,nums.length-1);
        int two = HouseRobberOne(nums,1,nums.length);
        
        return Math.max(one,two);
    }
    
    public int HouseRobberOne(int []nums,int start,int end){
        int rob = nums[start],no_rob = 0;
        
        for(int i = start + 1;i<end;i++){
            int new_rob = no_rob + nums[i];
            int new_no_rob = Math.max(no_rob,rob);
            rob = new_rob;
            no_rob = new_no_rob;
        }
        
        return Math.max(rob,no_rob);
    }
}