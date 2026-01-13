class Solution {
    public int maxProfit(int[] prices, int fee) {
        int b = Integer.MIN_VALUE;
        int s = 0;

        for (int price : prices){
            b = Math.max(b, s- price);
            s = Math.max(s,b+price-fee);
        }
        return s;
        
    }
}