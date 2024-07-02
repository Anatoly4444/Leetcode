class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val maxRepeat = 2
        var counter = 0
        var vCache: Int? = null
        for(i in nums.indices) {
            if(vCache != nums[i]) {
                vCache = nums[i]
                counter = 1
            } else counter++

            if(counter > 2)
                nums[i] = Int.MAX_VALUE
        }
        var counter2 = 0
        for(i in nums.indices.reversed()) {
            if(nums[i] == Int.MAX_VALUE) {
                for(j in i..< nums.lastIndex) {
                    nums[j] = nums[j + 1]
                }
                counter2++
            }
        }
        return nums.size - counter2
    }
}