class Solution {
    fun sumZero(n: Int): IntArray {
        var arr = IntArray(n)
        var counter = 0
        val x: Int = if(n % 2 == 0) {n / 2} else {
            arr[counter] = 0
            counter++
            (n - 1) / 2
        }
        for(i in 1..x) {
            arr[counter++] = i
            arr[counter++] = i * -1
        }
        return arr
    }
}