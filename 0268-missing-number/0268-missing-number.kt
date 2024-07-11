class Solution {
    fun missingNumber(nums: IntArray): Int {
        val set = nums.toHashSet()
        val min = 0
        val max = nums.size
        var x = min
        while(x <= max) {
            if(!set.contains(x))
                return x
            x++
        }
        return x
    }
}