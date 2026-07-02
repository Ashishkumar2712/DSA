class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        int low = 1, high = max;

        while (low < high) {
            int mid = low + (high - low) / 2;
            int totalHours = 0;

            for (int pile : piles) {
                totalHours += (pile + mid - 1) / mid; // same as ceil(pile / mid)
            }

            if (totalHours > h) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
}