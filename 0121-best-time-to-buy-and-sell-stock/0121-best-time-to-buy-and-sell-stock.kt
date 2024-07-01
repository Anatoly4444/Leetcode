class Solution {
    fun maxProfit(prices: IntArray): Int {
        var profit = 0
        var minPriceIndex = 0
        for(j in 1..prices.lastIndex) {
            if(prices[j] < prices[minPriceIndex]) {
                minPriceIndex = j
                continue
            }
            profit = max(profit, prices[j] - prices[minPriceIndex])
        }
        return profit
    }
}