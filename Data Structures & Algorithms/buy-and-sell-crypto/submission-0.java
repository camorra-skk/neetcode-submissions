class Solution {
    public int maxProfit(int[] prices) {
        int minSoFar = prices[0];
        int res = 0;

        for(int i: prices) {
            minSoFar = Math.min(minSoFar,i);

            res = Math.max(res,i-minSoFar);
        }
        return res;
    }
}
