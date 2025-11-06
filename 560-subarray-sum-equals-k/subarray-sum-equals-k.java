class Solution {
    public int subarraySum(int[] nums, int k) {
        
      /*  int n =nums.length;
        int count = 0;

        for (int r=0; r<n; r++){
            int sum = 0;

        for (int l=r; l<n; l++){
            sum +=nums[l];
            if (sum==k) count++;
        }
        }
            return count;
    }
}*/
HashMap<Integer, Integer> map = new HashMap<>();
map.put(0,1);
int n = nums.length;
int count = 0;
int pf = 0;


for (int i=0; i<n; i++){
pf += nums[i];

if (map.containsKey (pf-k)){
    count += map.get(pf-k);
}
map.put( pf , map.getOrDefault(pf , 0)+1);
    }
    return count;
}
}



        

