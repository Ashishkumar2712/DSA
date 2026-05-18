class Solution {
    public List<Integer> findLonely(int[] nums) {
        int n = nums.length;
        HashMap< Integer, Integer> map = new HashMap<>();

        for (int i =0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);


        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =0; i<n; i++){
            if (map.get (nums[i]) == 1 && !map.containsKey(nums[i]-1) && !map.containsKey(nums[i]+1)){
                list.add(nums[i]);
            }
        }
return list;


    }
}