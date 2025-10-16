class Solution {
    public int maxOperations(int[] nums, int k) {
       /* Arrays.sort(nums );
        int n = nums.length;
       int i =0;
       int j =n-1;
       int count = 0;

       while (i < j){
        int sum = nums[i] + nums[j];
        if (sum == k ){
            count ++;
            i++;
            j--;
        }
        else if (sum<k){
        i++;
       }
       else {
       j--;

       }
}
       return count ;
       }
   }*/

   HashMap <Integer , Integer > map = new HashMap<>();
   int count = 0;
   for (int num: nums ){
    int comp= k - num;
    if (map.getOrDefault(comp,0)>0){
        count++;
         map.put(comp, map.get(comp) - 1);
            } else {
        map.put(num, map.getOrDefault(num, 0)+1);

    }
   }
   return count ;
    }
}
