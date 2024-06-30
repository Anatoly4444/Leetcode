class Solution {
    fun sumZero(n: Int): IntArray {
        var list = mutableListOf<Int>()
        val x: Int = if(n % 2 == 0) {n / 2} else {
            list.add(0)
            (n - 1) / 2
        }
        for(i in 1..x) {
            list.add(i)
            list.add(i * -1)   
        }
        return list.toIntArray()
    }
}