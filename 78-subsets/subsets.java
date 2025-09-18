class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack (nums,0, new ArrayList<>(), result);
        return result;
    }
    private void backtrack (int nums[], int start, List<Integer> curr, List<List<Integer>> result){
        int n = nums.length;
        result.add(new ArrayList<>(curr));
        for (int i=start; i<n; i++){
            curr.add (nums[i]);
            backtrack (nums, i+1,curr ,result);
            curr.remove (curr.size()-1);
        }
    }
        }
    