class Solution {
    fun sumZero(n: Int): IntArray {
        var list = IntArray(n)
        var counter = 0
        val x: Int = if(n % 2 == 0) {n / 2} else {
            list[counter] = 0
            counter++
            (n - 1) / 2
        }
        for(i in 1..x) {
            list[counter++] = i
            list[counter++] = i * -1
        }
        return list
    }
}