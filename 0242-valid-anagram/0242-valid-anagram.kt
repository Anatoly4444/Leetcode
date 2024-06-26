class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        return t.toList().sorted() == s.toList().sorted()
    }
}