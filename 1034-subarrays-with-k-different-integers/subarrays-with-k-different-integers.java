class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return most (nums,k) - most(nums,k-1);
    }
        private int most(int[] nums, int k){
            int i =0;
            int count =0;
            int n = nums.length;
            HashMap<Integer, Integer> map = new HashMap<>();

             for (int j = 0; j < n; j++) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            if (map.get(nums[j])==1){
                k--;
            }

            while (k < 0){
               map.put(nums[i], map.get(nums[i]) - 1);

                if (map.get(nums[i])==0){
                    k++;
                }
                i++;
            }
            count += (j-i+1);

              
        }
        return count;
    }
}