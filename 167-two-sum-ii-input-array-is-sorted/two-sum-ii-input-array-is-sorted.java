class Solution {
    public int[] twoSum(int[] nums, int target) {
   /*  int n = numbers.length;
    int left =0;
    int right =n-1;

    while (left<right ){
        int sum = numbers[left] + numbers[right];
        if (sum == target){
            return new int[] {left+1, right+1};
        }
            else if (sum < target){
                left++;
            }
            right --;
             
              
    }
                return new int[] {0,0};
            }

        }*/
    

















    int n = nums.length;
    int i =0;
    int j = n-1;

    while (j > i){
        int sum = nums[i] + nums[j];
        if (sum == target){
            return new int[] {i+1, j+1};
        }
        else if (sum < target){
            i++;
        }
        else {
            j--;
        }
    }
    return new int[] {0,0};
    }
}
