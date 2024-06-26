class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        nums.forEachIndexed{i, num ->
            val potential = target - num
            if(potential in map) return intArrayOf(map.getValue(potential), i)
            map.put(num, i)
        }
        return intArrayOf()
    }
}