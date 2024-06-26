class Solution {
    fun singleNumber(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()
        for (i in nums) {
            map.compute(i) {_,v -> if(v == null) 1 else v + 1}
        }
        return map.filter { it.value == 1 }.keys.first()
    }
}