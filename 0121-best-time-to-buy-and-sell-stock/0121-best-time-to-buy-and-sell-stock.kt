class Solution {
    fun maxProfit(prices: IntArray): Int {
        var result = 0
        var buyDay = 0
        for(x in 0..< prices.lastIndex) {
            buyDay = if(x == 0)
                prices[x]
            else {
                if(prices[x] < buyDay) prices[x] else continue
            }
            for(e in x + 1..prices.lastIndex) {
                val sellDay = prices[e]
                val profit = sellDay - buyDay
                result = if(profit > result) profit else result
            }
        }
        return result
    }
}