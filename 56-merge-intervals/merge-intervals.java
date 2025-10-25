
        
    class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        // Step 1: Sort intervals by start
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int idx = 0; // index of last merged interval

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= intervals[idx][1]) {
                // Overlap → merge into intervals[idx]
                intervals[idx][1] = Math.max(intervals[idx][1], intervals[i][1]);
            } else {
                // No overlap → move idx forward and copy interval
                idx++;
                intervals[idx] = intervals[i];
            }
        }

        // Only keep merged intervals
        return Arrays.copyOf(intervals, idx + 1);
    }
}
