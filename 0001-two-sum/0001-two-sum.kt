class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map =  nums.withIndex().groupBy(keySelector = {it.value}, valueTransform = {it.index})
        if(target == 0) {
            for (i in nums.indices) {
                val v = map.get(nums[i] * - 1)
                v?.let { return intArrayOf(i, v.last()) }
            }
        }
        for (i in nums.indices) {
            val iElement = nums[i]
            val potential =  target - iElement
            val el1 = map.get(iElement)
            if(potential == iElement && el1?.size == 2) {
                return el1.toIntArray()
            }
            val v = map.get(potential)
            if(potential != iElement && v != null) {
                return intArrayOf(v.first(), i)
            }
        }
        return intArrayOf()
    }
}