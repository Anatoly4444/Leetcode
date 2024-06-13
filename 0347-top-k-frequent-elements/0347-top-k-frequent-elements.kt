class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val map = HashMap<Int, Int>()
    for(i in nums) {
        map.compute(i) { _ , x -> if(x == null) 1 else x + 1 }
    }
    val sortedMap = map.toList().sortedByDescending { (_, v) -> v }.toMap()
    var a = IntArray(k)
    var n = 0
    val arrayOf = sortedMap.keys.toIntArray()
    while(n < k) {
        val element = arrayOf[n]
        a[n] = element
        n++
    }
    return a
}
}