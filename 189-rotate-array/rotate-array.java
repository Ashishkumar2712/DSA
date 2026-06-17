class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        //int[] arr = new int[n];
                k = k % n;


        ArrayList<Integer> list = new ArrayList<>();

        for (int i =n-k; i<n; i++){
            list.add(nums[i]);

        }
        for (int j=0; j<n-k; j++){
            list.add(nums[j]);

        }
         for (int i = 0; i < n; i++) {
            nums[i] = list.get(i);    
    }
}
}