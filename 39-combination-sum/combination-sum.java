class Solution {
    public List<List<Integer>> combinationSum(int[] candidate, int target) {
        List <List<Integer>> result = new ArrayList<>();
        backtrack(candidate, 0, target, result, new ArrayList<>());
        return result ;
    }
        private void backtrack ( int[] candidate, int start , int target , List<List<Integer>> result , List<Integer> current){
            if (target<0) return;
            if (target == 0){
                result.add (new ArrayList<>(current));
            }
            for (int i = start ; i < candidate.length; i++){
                current.add (candidate[i]);
                backtrack(candidate , i , target-candidate[i], result, current);
                current.remove (current.size()-1);
            }

        }

    }
