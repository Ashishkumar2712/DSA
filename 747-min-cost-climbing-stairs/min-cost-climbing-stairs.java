class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
       /* int[] dp = new int[n];

        for (int i=0; i<n; i++){
            if (i<2) {
                dp[i] = cost[i];
            }
            else{
                dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2] );
            }
            
        }

             return Math.min(dp[n-1], dp[n-2]);
        
    }
}*/
for (int i=2 ; i<n; i++){
    if (i<2) return n;

    cost[i] =  Math.min(cost[i-1], cost[i-2]) + cost[i];
}
return Math.min(cost[n-1], cost[n-2]);
    }
}