class Solution {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        val jewelsSet = jewels.toHashSet()
        var counter = 0
        for (i in stones) {
            if(jewelsSet.contains(i))
                counter++
        }
        return counter
    }
}