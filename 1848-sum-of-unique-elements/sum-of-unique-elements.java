class Solution {
    public int sumOfUnique(int[] nums) {
        int n = nums.length;
       /* int[] f = new int[101]; 
       
       for (int num: nums ){
        f[num]++;
       }
       int sum = 0;
       for (int i =0; i<=100; i++){
        if (f[i] == 1 ){
            sum += i;
        }
       }
       return sum;
    }
}*/
int sum =0;
HashMap <Integer, Integer> map = new HashMap<>();
for (int i =0; i<n; i++){
map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
}
       
 for (int i = 0; i < n; i++) {
if (map.get(nums[i])==1) sum += nums[i];
}
    return sum;
}
}
