class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        TreeSet<Integer> tree = new TreeSet<>();
        for (int i =0; i<n; i++){
            tree.add(arr[i]);
        }
        HashMap <Integer, Integer > map = new HashMap<>();
        int r =1 ;
        for (int num : tree) {
            map.put(num, r++);
        }

        

        int[] rank = new int [n];
        for (int i=0; i<n; i++){
            rank[i] = map.get(arr[i]);
        }
        return rank;


        
    }
}