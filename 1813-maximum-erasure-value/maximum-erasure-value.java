class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        int l =0;
        int max = 0;
        int sum =0;


        for (int r=0; r<n; r++){
            while (set.contains(nums[ r])){
            set.remove(nums[l]);
            sum -=(nums[l]);
            l++;
        }
        set.add(nums[r]);
        sum += (nums[r]);
        max = Math.max(max, sum);
    }
    return max;


        
    }
}