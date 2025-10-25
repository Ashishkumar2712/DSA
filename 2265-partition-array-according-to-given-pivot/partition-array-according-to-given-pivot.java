class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
      int n = nums.length;
      int[] res = new int[n];
      int i = 0;

      for (int num: nums){
        if (num < pivot ){
           res[i++] = num;
        }
      }
      
      for (int num: nums){
        if (num == pivot ){
           res[i++] = num;
        }
      }
      for (int num: nums){
        if (num > pivot ){
           res[i++] = num;
        }
      }
      return res;
    }
}
    