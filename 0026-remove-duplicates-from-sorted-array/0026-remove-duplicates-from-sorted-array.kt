class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val list = mutableListOf<Int>()
        for(i in nums) {
            if(!list.contains(i)) {
                list.add(i)
            }
        }
        for(i in list.indices) {
            nums[i] = list[i]
        }
        return list.size
    }
}