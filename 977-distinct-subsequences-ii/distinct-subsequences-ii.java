class Solution {
    public int distinctSubseqII(String s) {
        int n = s.length();
        long[] dp = new long[n + 1];
        dp[0] = 1;
        int MOD = 1_000_000_007;

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 1; i < dp.length; i++) {
            dp[i] = 2 * dp[i - 1] % MOD;

            char ch = s.charAt(i - 1);
            if (map.containsKey(ch)) {
                int j = map.get(ch);
                dp[i] = (dp[i] - dp[j - 1] + MOD) % MOD;

            }
            map.put(ch, i);
        }
        return (int) ((dp[n] - 1 + MOD) % MOD);

    }
}