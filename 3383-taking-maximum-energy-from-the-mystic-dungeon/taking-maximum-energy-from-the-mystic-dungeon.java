class Solution {
    public int maximumEnergy(int[] energy, int k) {
          int n = energy.length;
        int ans = Integer.MIN_VALUE;

        for (int r = 0; r < k; r++) {
            int curr = 0;
            int lastIndex = r + ((n - 1 - r) / k) * k;

            for (int j = lastIndex; j >= 0; j -= k) {
                curr += energy[j];
                ans = Math.max(ans, curr);
            }
        }

        return ans;
    }
}
   