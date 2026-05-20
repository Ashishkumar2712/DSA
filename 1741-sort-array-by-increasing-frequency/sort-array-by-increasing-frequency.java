class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i] , 0) +1 );
        }
            List<Integer> list = new ArrayList<>();
            for (int i=0; i<n; i++){
                list.add(nums[i]);
            }
            Collections.sort (list, (a,b) -> {
                int f1 = map.get(a);
                int f2 = map.get(b);

                if (f1 != f2){
                    return f1-f2 ;

                }
                return b-a;

            });

            for (int i=0; i<n; i++){
                nums[i] = list.get(i);
            }




        return nums;
        
    }
}