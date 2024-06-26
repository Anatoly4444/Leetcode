class Solution {
    val set = mutableSetOf<Int>()
    fun isHappy(n: Int): Boolean {
        if(n in set) return false 
        else set.add(n)
        val list = n.toString().map{ it.digitToInt() }
        val sum = list.map { it * it }.sum()
        if(sum == 1)
            return true
        return isHappy(sum)
    }
}