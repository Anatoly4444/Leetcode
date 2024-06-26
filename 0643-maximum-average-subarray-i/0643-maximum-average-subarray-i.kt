class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        val queue = LinkedList<Int>()
        var avg = Double.NEGATIVE_INFINITY
        var sum = 0
        var x = 0
        for(i in nums) {
            sum += i
            queue.addLast(i)
            if(queue.size > k) {
                sum -= queue.first
                queue.removeFirst()
            } 
            if(queue.size == k) {
                val avgTemp = sum.toDouble() / k
                if(avgTemp > avg)
                    avg = avgTemp
            }
        }
        return avg
    }
}