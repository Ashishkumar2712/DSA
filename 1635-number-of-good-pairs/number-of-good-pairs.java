class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer > map =  new HashMap<>();
        int count = 0;
        int n = nums.length;
        for (int i =0; i<n; i++ ){
            int k = map.getOrDefault(nums[i],0);
            count+= k;
            map.put(nums[i], k + 1);
        }
        return count;
    }
}