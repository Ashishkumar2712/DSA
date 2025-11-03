class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        // brute force 


      /*  List<Integer> list = new ArrayList<>();
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
    }*/

    // optimize 

   /*Set<Integer> set = new HashSet<>();
   Arrays.sort(nums1);
   Arrays.sort(nums2);

   int i =0, j =0;

   while (i <nums1.length && j< nums2.length){
    if (nums1[i] < nums2[j]){
        i++;
    }
    else if (nums1[i] > nums2[j]){
        j++;
    }
    else {
        set.add(nums1[i]);
        i++;
        j++;
    }
   }
   int[] res = new int[set.size()];
   int l= 0;
   for (Integer num:set){
    res[l++] = num;
   }
   return res ;
    }
}
*/
int n = nums1.length;
int m = nums2.length;
Set <Integer> set = new HashSet<>();
ArrayList<Integer> list = new ArrayList<>();

for (int i =0; i < n ; i++){
    set.add(nums1[i]);
}
for (int j =0; j<m; j++){
    if (set.contains (nums2[j])){
        list.add(nums2[j]);
        set.remove (nums2[j]);
    }
}
int[] result = new int [list.size()];
for (int k=0; k<list.size(); k++){
    result[k] = list.get(k);
}
return result ;
    }
}


        
    