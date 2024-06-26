class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val set = mutableSetOf<Int>()
        for(i in nums) {
            val added = set.add(i)
            if(!added)
                return true
        }
        return false
    }
}