class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       /* int count = 0;
        int n = nums.length;

        for (int i =0; i < n; i++){
            int sum = 0;
            for (int j =i; j <n ; j++){
                sum += nums[j];
        
            if (sum % k == 0) count++;

        }
    }
    return count;
    }
}*/
int n = nums.length;
HashMap <Integer, Integer> map = new HashMap<>();
map.put(0,1);
int count = 0;
int pf =0;

//for (int num: nums){
    for (int i =0; i<n; i++){
   
pf += nums[i];
int mod = ((pf % k) +k) %k;

if (map.containsKey (mod)){
    count += map.get(mod);
}

map.put (mod, map.getOrDefault(mod, 0)+1);
    }
    return count ;
}
}