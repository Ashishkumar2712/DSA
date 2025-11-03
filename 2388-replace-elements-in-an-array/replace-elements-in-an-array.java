class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i =0; i<n; i++){
            map.put(nums[i], i);
        }
        for (int[] op:operations){
            int old = op[0];
            int nw = op[1];

            int index = map.get(old);
            nums[index] = nw ;

            map.remove(old);
            map.put (nw, index);
        }
        return nums;

    }
}