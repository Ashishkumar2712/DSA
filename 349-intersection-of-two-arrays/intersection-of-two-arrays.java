class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;

        for (int i =0; i<n; i++){
            for (int j =0; j<m; j++){
                if (nums1[i]==nums2[j]&& !list.contains(nums1[i])){
                   list.add(nums1[i]);
                   break;
                }
            }
        }
        int l = list.size();
        int[] res = new int[l];
        for (int i =0; i<l; i++){
            res[i]= list.get(i);
        }
        return res ;
    }
    }
        
    