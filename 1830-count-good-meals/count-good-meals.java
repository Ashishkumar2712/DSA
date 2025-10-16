class Solution {
    public int countPairs(int[] deliciousness) {
       final int MOD = 1000000007;
        HashMap<Integer, Integer> map = new HashMap<>();
        long count = 0;

        for (int val : deliciousness) {
            for (int i = 0; i <= 21; i++) {
                int target = (1 << i) - val;
                count += map.getOrDefault(target, 0);
            }
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        return (int)(count % MOD);
    }
}