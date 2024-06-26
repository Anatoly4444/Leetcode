class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length)
            return false
        val map = s.groupingBy { it }.eachCount()
        val map2 = t.groupingBy { it }.eachCount()
        return map == map2
    }
}