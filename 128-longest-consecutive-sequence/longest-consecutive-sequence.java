class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int max = 0;
        Set<Integer> set = new HashSet<>();

        for (int i=0; i<n; i++){
            set.add(nums[i]);
        }
        for (int i=0; i<n; i++){
            int count = 1;

            // for left of array
            int num = nums[i];
            while (set.contains(--num)){
                count++;
                set.remove(num);
            }

            // for right of an array

            num = nums[i];
            while (set.contains(++num)){
                count++;
                set.remove(num);
            }
            max = Math.max(max , count );
        }
        return max;
    }
}