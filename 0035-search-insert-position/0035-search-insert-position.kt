class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        val i = nums.indexOf(target)    
        if(i == -1) {
            if(target > nums.last())
                return nums.size
            if(target < nums.first())
                return 0
            var targetTemp = target
            while(targetTemp > nums.first()) {
                targetTemp--
                val prevIndex = nums.indexOf(targetTemp)
                if(prevIndex != -1) {
                    return prevIndex + 1
                }
            }
            targetTemp = target
            while(targetTemp < nums.last()) {
                targetTemp++
                val nextIndex = nums.indexOf(targetTemp)
                if(nextIndex != -1) {
                    return nextIndex - 1
                }
            }
        }
        return i
    }
}