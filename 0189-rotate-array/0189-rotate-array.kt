class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        val list = LinkedList<Int>()
        list.addAll(nums.toList())

         for (times in 1..k) {
           list.push(list.last)
           list.removeLast()
         }

         list.forEachIndexed { index, i ->
             nums[index] = i
         }
    }
}