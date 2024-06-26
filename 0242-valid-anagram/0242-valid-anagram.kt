class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length)
            return false
        return t.toList().sorted() == s.toList().sorted()
    }
}