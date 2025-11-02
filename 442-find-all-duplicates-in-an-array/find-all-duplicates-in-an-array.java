class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       /* List<Integer> duplicate = new ArrayList<>();
        int n = nums.length;

        for (int j =0; j<n; j++){
            int index = Math.abs (nums[j])-1;
              if (nums[index] < 0) {
            duplicate.add (Math.abs(nums[j]));
        }
        else {
            nums[index] =-nums[index];
        }

        }
        return duplicate;
}

} */
int n = nums.length;
HashMap <Integer, Integer> map = new HashMap<>();
for (int i =0; i<n; i++){
map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
}
 List<Integer> duplicates = new ArrayList<>();     
for (int key : map.keySet()) {
if (map.get(key) > 1) {
duplicates.add(key);
}
}
    return duplicates ;
}
}