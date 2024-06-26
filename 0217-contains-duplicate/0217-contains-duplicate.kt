class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val set = mutableSetOf<Int>()
        for(i in nums) {
            val add = set.add(i)
            if(!add)
                return true
        }
        return false
    }
}