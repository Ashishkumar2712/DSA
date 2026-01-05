class Solution {
    public int climbStairs(int n) {
        /*int[] qb = new int[n + 1];
        return helper(n, qb);
    }

    private int helper(int n, int[] qb) {
        if (n == 0) return 1;
        if (n < 0) return 0;

        if (qb[n] != 0) return qb[n];

        qb[n] = helper(n - 1, qb) + helper(n - 2, qb);
        return qb[n];
    }
}
       if(n <=3) return n ;

       int curr =0;
       int i = 3;
       int j = 2;

       for (int k =3; k<n; k++){
        curr = i +j;
        j=i;
        i= curr;
       }
       return curr;
        
    }
}*/

if (n==1)  return 1;
//if (n==2)  return 2;

int[] dp = new int[n+1];
dp[1] = 1 ;
dp[2] = 2 ;

for (int i=3 ; i<=n; i++){
    dp[i] = dp[i-1] + dp[i-2];
}
return dp[n];
    }
}