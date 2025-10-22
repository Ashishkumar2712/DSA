class Solution {
    public int removeDuplicates(int[] nums) {
      /*  int n = nums.length ;
        TreeSet<Integer> set = new TreeSet<>();

        for (int num: nums){
          set.add(num);
        }
        int i =0;
          for (int val : set){
            nums[i++] = val;
          }
          return set.size();

        }

        }*/

        int n = nums.length;
        int i =0;

        for (int j=i+1; j<n; j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i] = nums[j];

            }
        }
              return i+1;
              
    }
}



    