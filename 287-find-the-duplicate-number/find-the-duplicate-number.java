class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
// so use index eg if we get value {1,3,4,2,2} write the index below it and detect the cycle .
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];


          } while (slow != fast);
          // once cycle is detected reset slow pointer to index 0 and dont reset fast index.
          // iterate one point at a time both fast and slow .
            slow = nums[0];

         while (slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
    
         return slow;
}
      }

     