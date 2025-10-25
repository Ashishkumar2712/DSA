public class Solution {
public void rotate(int[] nums, int k) {
      /* int n = nums.length;
       k =  k%n;

      reverse (nums, 0, n-1);
      reverse (nums, 0, k-1);
      reverse (nums, k , n-1);
}

private void reverse (int[] nums, int i, int j){
    while (i < j){
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp ;
    i++;
    j--;
}
}
}*/
   int n = nums.length;
        k = k % n; 
        int count = 0; 

        for (int start = 0; count < n; start++) {
            int current = start;
            int prev = nums[start];

            do {
                int next = (current + k) % n;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current); 
        }
    }
}
    
