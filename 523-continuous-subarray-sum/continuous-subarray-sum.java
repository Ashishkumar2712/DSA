class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int n = nums.length;
        int pf =0;

        for (int i = 0; i < nums.length; i++) {
            pf += nums[i] ;
             int m= pf% k;

            if (map.containsKey(m)){
                if (i - map.get(m) >= 2) {
                    return true;
                }
            } else {
                map.put(m, i);
            }
        }
        return false;
    }
}