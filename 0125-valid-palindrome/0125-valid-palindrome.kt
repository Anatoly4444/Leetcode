class Solution {
    fun isPalindrome(s: String): Boolean {
        val r = s.filter{ it.isLetterOrDigit() }.lowercase()
        return r == r.reversed()
    }
}