class Solution {
    public int[] sortedSquares(int[] nums) {
       int n = nums.length;
        int[] res = new int[n];
        
        for (int i=0; i<n; i++){
            nums[i] = nums[i]*nums[i];
        }

        int l =0;
        int r = n-1;

         for (int j = n - 1; j >= 0; j--) {
            if (nums[l] > nums[r]) {
                res[j] = nums[l];
                l++;
            } else {
                res[j] = nums[r];
                r--;
            }
        }

        return res;
    }
}

        /*int n = nums.length;

         int[] res = new int[n];
        for (int i =0; i <n ; i++){
            res[i] = nums[i] * nums[i];
        }
        Arrays.sort (res);
        return res;
    }
}*/