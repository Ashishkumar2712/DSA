class Solution {
    public int findMaxLength(int[] nums) {
        HashMap < Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int n = nums.length;
        int length = 0;
        int sum =0;

        for (int j =0; j<n; j++){
           sum += (nums[j] == 0 ? -1:1);

           if (map.containsKey(sum)){
            
            length = Math.max(length, j - map.get(sum));
           }
           else {
            map.put(sum , j);
           }
        }
        return length;
    }
}