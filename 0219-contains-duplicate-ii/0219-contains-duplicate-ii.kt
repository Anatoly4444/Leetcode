class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val map = nums.withIndex().groupBy(keySelector = {it.value}, valueTransform = {it.index}).filter { it.value.size > 1 }
        for(i in map) {
            val indexes = i.value
            var min = -1
            for(x in indexes.indices) {
                val x1 = x + 1
                for(o in x1..indexes.lastIndex) {
                    val minTemp = abs(indexes[x] - indexes[o])
                    if(minTemp < min || min == -1)
                        min = minTemp
                }
            }
            if(min <= k)
                return true
        }
        return false
    }
}