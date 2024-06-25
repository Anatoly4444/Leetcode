class Solution {
    fun plusOne(digits: IntArray): IntArray {
        val list = LinkedList<Int>()
        var incrNext = true
        for(i in digits.size - 1 downTo 0) {
            if(incrNext) {
                val i1 = digits[i] + 1
                if(i1 == 10) {
                    list.addFirst(0)
                    incrNext = true
                    if(i == 0)
                        list.addFirst(1)
                } else {
                    list.addFirst(i1)
                    incrNext = false
                }
            } else {
                list.addFirst(digits[i])
            }
        }
        return list.toIntArray()
    }
}