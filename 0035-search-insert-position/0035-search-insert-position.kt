class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        val i = nums.indexOf(target)    
        if(i == -1) {
            if(target > nums.last())
                return nums.size
            if(target < nums.first())
                return 0
            var targetTemp1 = target
            while(targetTemp1 > nums.first()) {
                targetTemp1--
                val prevIndex = nums.indexOf(targetTemp1)
                if(prevIndex != -1) {
                    return prevIndex + 1
                }
            }
            var targetTemp2 = target
            while(targetTemp2 < nums.last()) {
                targetTemp2++
                val nextIndex = nums.indexOf(targetTemp2)
                if(nextIndex != -1) {
                    return nextIndex - 1
                }
            }
        }
        return i
    }
}