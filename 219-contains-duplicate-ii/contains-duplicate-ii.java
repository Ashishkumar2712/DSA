class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> result = new HashSet<>();
        int n = nums.length;

        for (int i=0;i<n;i++){

           if (result.contains (nums[i])) return true ;
                   result.add(nums[i]);


            if (result.size()>k){
                result.remove(nums[i-k]);
            }
        }
        return false;
        


    }
}


/*int n = nums.length;

for (int i =0; i<n; i++){
    for (int j = i+1; j<n; j++){
        if (nums[i] == nums[j]  && j-i <= k){
            return true;
        }
    }
}
return false ;
    }
}*/