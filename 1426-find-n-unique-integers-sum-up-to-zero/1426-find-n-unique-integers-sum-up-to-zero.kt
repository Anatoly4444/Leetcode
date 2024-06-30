class Solution {
    fun sumZero(n: Int): IntArray {
        var list = mutableListOf<Int>()
        val x: Int = if(n % 2 == 0) {n / 2} else {
            list.add(0)
            (n - 1) / 2
        }
        for(i in 0..< x) {
            while(true) {
                val k = (1..10000).random()
                if(!list.contains(k)) {
                    list.add(k)
                    list.add(k * -1)
                    break;
                }
            }
        }
        return list.toIntArray()
    }
}