class Solution {
    public int[] twoSum(int[] nums, int target) {
       int n = nums.length;
        HashMap <Integer, Integer> map = new HashMap<>();// hash map bnna kyuki tc ghat jaayega 

        for(int i=0; i<n; i++){// iterate krr 0 se n tkk 
            int c = target - nums[i];// maan le agar tere pass 9 target hai and usmain tunne 7 ghata dia firr bhi tujh prr 2 bachenge and dekh 2 map main exist krta hai ki nhi

            if (map.containsKey(c)){
                return new int[] {map.get(c),i};// return krr 2,7 ko
            }
          map.put(nums[i], i);// yeh line isliye kyuki hmme index return krna hai naa ki value ;
        }
        return new int[] {};
    }
}
   